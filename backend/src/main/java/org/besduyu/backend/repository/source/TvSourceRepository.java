package org.besduyu.backend.repository.source;

import java.util.UUID;
import org.besduyu.backend.domain.model.source.TvSource;
import org.springframework.data.repository.CrudRepository;

public interface TvSourceRepository extends CrudRepository<TvSource, UUID> {
}
