package org.besduyu.backend.service.source;

import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.besduyu.backend.domain.dto.request.CreateInfoRequest;
import org.besduyu.backend.domain.model.source.Info;
import org.besduyu.backend.domain.model.source.Source;
import org.besduyu.backend.repository.source.InfoRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InfoService {

  private final InfoRepository infoRepository;
  private final SourceService sourceService;

  public Info createInfo(CreateInfoRequest request) {
    var info = Info.builder()
        .isValid(true)
        .name(request.getName())
        .topic(request.getTopic())
        .description(request.getDesc())
        .source(sourceService.getSource(request.getSourceId()))
        .build();

    return infoRepository.save(info);
  }

  public Info getInfo(UUID id) {
    return infoRepository.findById(id).orElseThrow();
  }

  public List<Info> getAllInfos() {
    return (List<Info>) infoRepository.findAll();
  }

  public List<Info> getAllInfosBySource(Source source) {
    return (List<Info>) infoRepository.findAllBySource(source);
  }
}