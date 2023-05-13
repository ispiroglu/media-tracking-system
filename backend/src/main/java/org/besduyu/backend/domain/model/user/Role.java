package org.besduyu.backend.domain.model.user;

import lombok.Getter;

@Getter
public enum Role {
  ADMIN("ADMIN"),
  BACKOFFICE("BACKOFFICE"),
  CUSTOMER("CUSTOMER");

  private final String role;
  Role(String role) {
    this.role = role;
  }
}
