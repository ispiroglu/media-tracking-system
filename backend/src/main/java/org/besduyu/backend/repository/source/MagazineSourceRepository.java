package org.besduyu.backend.repository.source;

import java.util.UUID;
import org.besduyu.backend.domain.model.source.MagazineSource;
import org.springframework.data.repository.CrudRepository;

public interface MagazineSourceRepository extends CrudRepository<MagazineSource, UUID> {
}
