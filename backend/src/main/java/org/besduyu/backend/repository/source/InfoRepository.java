package org.besduyu.backend.repository.source;

import java.util.UUID;
import org.besduyu.backend.domain.model.source.Info;
import org.besduyu.backend.domain.model.source.Source;
import org.springframework.data.repository.CrudRepository;

public interface InfoRepository extends CrudRepository<Info, UUID> {

  Iterable<Info> findAllBySource(Source source);
}
