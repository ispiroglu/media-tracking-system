package org.besduyu.backend.service.source;

import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.besduyu.backend.domain.dto.request.CreateSourceRequest;
import org.besduyu.backend.domain.model.source.Info;
import org.besduyu.backend.domain.model.source.Source;
import org.besduyu.backend.repository.source.SourceRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SourceService {

  private final SourceRepository sourceRepository;

  public void createSource(CreateSourceRequest request) {
    var source = Source.builder()
        .sourceType(request.getSourceType())
        .name(request.getName())
        .build();

    sourceRepository.save(source);
  }

  public Source getSource(UUID id) {
    return sourceRepository.findById(id).orElseThrow();
  }

  public List<Source> getAllSources(){
    return (List<Source>) sourceRepository.findAll();
  }

  public void updateSource(CreateSourceRequest request, UUID id) {
    var source = sourceRepository.findById(id).orElseThrow();

    if (request.getSourceType() != null)
      source.setSourceType(request.getSourceType());
    if (request.getName() != null)
      source.setName(request.getName());

    sourceRepository.save(source);
  }

  public void addInfoToSource(UUID sourceId, Info info) {
    var source = getSource(sourceId);

    source.getInfoList().add(info);
    sourceRepository.save(source);
  }
}
