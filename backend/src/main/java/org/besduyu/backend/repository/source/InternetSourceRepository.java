package org.besduyu.backend.repository.source;

import java.util.UUID;
import org.besduyu.backend.domain.model.source.InternetSource;
import org.springframework.data.repository.CrudRepository;

public interface InternetSourceRepository extends CrudRepository<InternetSource, UUID> {
}
