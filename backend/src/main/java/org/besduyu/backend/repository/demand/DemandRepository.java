package org.besduyu.backend.repository.demand;

import java.util.UUID;
import org.besduyu.backend.domain.model.demand.Demand;
import org.springframework.data.repository.CrudRepository;

public interface DemandRepository extends CrudRepository<Demand, UUID> {

  Iterable<Demand> findDemandsByActiveTrue();
}
