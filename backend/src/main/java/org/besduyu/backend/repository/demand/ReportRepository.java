package org.besduyu.backend.repository.demand;

import java.util.UUID;
import org.besduyu.backend.domain.model.demand.ReportDemand;
import org.springframework.data.repository.CrudRepository;

interface ReportRepository extends CrudRepository<ReportDemand, UUID> {
}
