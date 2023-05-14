package org.besduyu.backend.service.demand;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.besduyu.backend.domain.dto.request.CreateReportDemandRequest;
import org.besduyu.backend.domain.model.demand.Demand;
import org.besduyu.backend.repository.demand.DemandRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@Service
@RequiredArgsConstructor
@CrossOrigin
public class ReportDemandService {

  private final DemandRepository demandRepository;

  public void save(Demand demand) {
    demandRepository.save(demand);
  }

  public void createReportDemand(CreateReportDemandRequest request) {
    Instant deadline = null;

    switch (request.getReportPeriodType()) {
      case DAILY -> deadline = Instant.now().plus(1, ChronoUnit.DAYS);
      case WEEKLY -> deadline = Instant.now().plus(7, ChronoUnit.DAYS);
      case MONTHLY -> deadline = Instant.now().plus(30, ChronoUnit.DAYS);
    }

    var demand = Demand.builder()
        .name(request.getName())
        .description(request.getDescription())
        .active(true)
        .reportPeriodType(request.getReportPeriodType())
        .deadline(Date.from(deadline)).build();

    demandRepository.save(demand);
  }

  public List<Demand> getAllDemands() {
    return (List<Demand>) demandRepository.findDemandsByActiveTrue();
  }

  public Demand getDemandById(UUID id) {
    return demandRepository.findById(id).orElseThrow();
  }

  public void deleteDemandById(UUID id) {
    demandRepository.deleteById(id);
  }
}
