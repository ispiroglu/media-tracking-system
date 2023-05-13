package org.besduyu.backend.repository.source;

import java.util.UUID;
import org.besduyu.backend.domain.model.source.Source;
import org.springframework.data.repository.CrudRepository;

public interface SourceRepository extends CrudRepository<Source, UUID> {
}
