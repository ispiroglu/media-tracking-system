package org.besduyu.backend.service.admin;

import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.besduyu.backend.domain.dto.request.CreateInfoRequest;
import org.besduyu.backend.domain.dto.request.CreateSourceRequest;
import org.besduyu.backend.domain.model.source.Info;
import org.besduyu.backend.domain.model.source.Source;
import org.besduyu.backend.service.source.SourceService;
import org.besduyu.backend.service.source.InfoService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminService {

  private final SourceService sourceService;
  private final InfoService infoService;

  public void createSource(CreateSourceRequest request) {
    sourceService.createSource(request);
  }

  public void createInfo(CreateInfoRequest request) {
    var info = infoService.createInfo(request);
    sourceService.addInfoToSource(request.getSourceId(), info);
  }

  public void updateSource(CreateSourceRequest request, UUID sourceId) {
    sourceService.updateSource(request, sourceId);
  }

  public Source getSource(UUID sourceId) {
    return sourceService.getSource(sourceId);
  }

  public Info getInfo(UUID infoId) {
    return infoService.getInfo(infoId);
  }

  public List<Source> getAllSources() {
    return sourceService.getAllSources();
  }

  public List<Info> getAllInfos() {
    return infoService.getAllInfos();
  }
}
