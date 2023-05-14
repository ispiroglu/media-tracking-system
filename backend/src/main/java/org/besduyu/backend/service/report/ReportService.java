package org.besduyu.backend.service.report;

import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.besduyu.backend.domain.dto.request.CreateReportRequest;
import org.besduyu.backend.domain.model.report.Report;
import org.besduyu.backend.repository.report.ReportRepository;
import org.besduyu.backend.service.demand.ReportDemandService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReportService {

  private final ReportDemandService demandService;
  private final ReportRepository reportRepository;

  public void createReport(CreateReportRequest request) {
    var demand = demandService.getDemandById(request.getDemandId());
    var report = Report.builder()
        .name(request.getName())
        .description(request.getDescription())
        .demand(demand)
        .build();

    reportRepository.save(report);
    demand.setActive(false);
    demandService.save(demand);
  }

  public Report getReport(UUID reportId) {
    return reportRepository.findById(reportId).orElseThrow();
  }

  public List<Report> getAllReports(){
    var x = (List<Report>) reportRepository.findAll();
    return  x;
  }

  public void deleteReport(UUID id) {
    reportRepository.deleteById(id);
  }
}
