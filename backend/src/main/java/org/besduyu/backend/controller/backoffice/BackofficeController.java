package org.besduyu.backend.controller.backoffice;

import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.besduyu.backend.domain.dto.request.CreateReportRequest;
import org.besduyu.backend.domain.model.demand.Demand;
import org.besduyu.backend.domain.model.report.Report;
import org.besduyu.backend.domain.model.source.Info;
import org.besduyu.backend.domain.model.source.Source;
import org.besduyu.backend.service.demand.ReportDemandService;
import org.besduyu.backend.service.report.ReportService;
import org.besduyu.backend.service.source.InfoService;
import org.besduyu.backend.service.source.SourceService;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/backoffice")
@CrossOrigin
@RequiredArgsConstructor
public class BackofficeController {

  private final ReportService reportService;
  private final SourceService sourceService;
  private final InfoService infoService;
  private final ReportDemandService demandService;

  @GetMapping("/source")
  public List<Source> getSources(@RequestParam MultiValueMap<String, String> params) {
    return sourceService.getAllSources();
  }

  @GetMapping("/source/{id}")
  public Source getSource(@PathVariable UUID id) {
    return sourceService.getSource(id);
  }

  @GetMapping("/demand")
  public List<Demand> getDemands(@RequestParam MultiValueMap<String, String> params) {
    return demandService.getAllDemands();
  }

  @GetMapping("/demand/{id}")
  public Demand getDemand(@PathVariable UUID id) {
    return demandService.getDemandById(id);
  }

  @PostMapping("/report")
  public void postReport(@RequestBody CreateReportRequest request) {
    reportService.createReport(request);
  }

  @PostMapping("/report-all")
  public void postReports(@RequestBody List<CreateReportRequest> request) {
    request.forEach(this::postReport);
  }

  @GetMapping("/report")
  public List<Report> getReports() {
    return reportService.getAllReports();
  }

  @GetMapping("/info")
  public List<Info> getInfos(@RequestParam UUID sourceId) {
    var source = sourceService.getSource(sourceId);
    return infoService.getAllInfosBySource(source);
  }

  @GetMapping("/infos")
  public List<Info> getInfos() {
    return infoService.getAllInfos();
  }
}
