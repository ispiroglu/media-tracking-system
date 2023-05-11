package org.besduyu.backend.domain.model.source;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity
public class BaseSource {
  @Id
  @GeneratedValue
  public UUID id;
}
