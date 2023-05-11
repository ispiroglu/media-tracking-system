package org.besduyu.backend.repository.source;

import java.util.UUID;
import org.besduyu.backend.domain.model.source.NewspaperSource;
import org.springframework.data.repository.CrudRepository;

public interface NewspaperSourceRepository extends CrudRepository<NewspaperSource, UUID> {
}
