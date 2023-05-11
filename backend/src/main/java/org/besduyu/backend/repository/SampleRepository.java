package org.besduyu.backend.repository;

import java.util.UUID;
import org.besduyu.backend.domain.model.SampleRecord;
import org.springframework.data.repository.CrudRepository;

public interface SampleRepository extends CrudRepository<SampleRecord, UUID> {
}
