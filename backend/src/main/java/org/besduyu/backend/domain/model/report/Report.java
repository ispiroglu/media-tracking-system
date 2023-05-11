package org.besduyu.backend.domain.model.report;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity
public class Report {
  @Id @GeneratedValue
  public UUID id;
}
