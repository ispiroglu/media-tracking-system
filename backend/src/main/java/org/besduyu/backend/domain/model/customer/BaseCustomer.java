package org.besduyu.backend.domain.model.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity
public class BaseCustomer {

  @Id @GeneratedValue
  public UUID id;
}
