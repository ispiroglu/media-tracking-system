package org.besduyu.backend.controller.customer;

import java.util.Collection;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.besduyu.backend.domain.dto.request.CreateReportDemandRequest;
import org.besduyu.backend.domain.model.demand.Demand;
import org.besduyu.backend.domain.model.report.Report;
import org.besduyu.backend.service.demand.ReportDemandService;
import org.besduyu.backend.service.report.ReportService;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
@CrossOrigin
public class CustomerController {

  private final ReportDemandService reportDemandService;
  private final ReportService reportService;
  // TODO: Get Session from getAuthentication() - getPrincipal()
  private final UUID customerID = UUID.fromString("6e67761f-3e60-4f5b-b3be-c7e96564d464");

  @PostMapping("/demand")
  public void postDemand(@RequestBody CreateReportDemandRequest request) {
    reportDemandService.createReportDemand(request);
  }

  @PostMapping("/demand-all")
  public void postDemand(@RequestBody List<CreateReportDemandRequest> list) {
    list.forEach(reportDemandService::createReportDemand);
  }

  @GetMapping("/demand")
  public List<Demand> getDemands(@RequestParam MultiValueMap<String, String> params) {
    return reportDemandService.getAllDemands();
  }

  @GetMapping("/demand/{id}")
  public Demand getDemand(@PathVariable UUID id) {
    return reportDemandService.getDemandById(id);
  }

  @DeleteMapping("/demand/{id}")
  public void deleteDemand(@PathVariable UUID id) {
    reportDemandService.deleteDemandById(id);
  }

  @GetMapping("/report/{id}")
  public Report getReport(@PathVariable UUID id) {
    return reportService.getReport(id);
  }

  @GetMapping("/report")
  public Collection<Report> getReports() {
    return reportService.getAllReports();
  }
}
