package org.besduyu.backend.domain.model.demand;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity
public class BaseDemand {
  @Id
  @GeneratedValue
  private UUID id;
}
