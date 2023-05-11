package org.besduyu.backend.repository.demand;

import java.util.UUID;
import org.besduyu.backend.domain.model.demand.ReportDemand;
import org.springframework.data.repository.CrudRepository;

interface ReportDemandRepository extends CrudRepository<ReportDemand, UUID> {
}
