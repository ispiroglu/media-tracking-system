package org.besduyu.backend.domain.model.enums;

import lombok.Getter;

@Getter
public enum SourceType {
  TV("TV"),
  INTERNET("INTERNET"),
  MAGAZINE("MAGAZINE"),
  NEWSPAPER("NEWSPAPER");

  private final String type;
  SourceType(String type) {
    this.type = type;
  }
}

