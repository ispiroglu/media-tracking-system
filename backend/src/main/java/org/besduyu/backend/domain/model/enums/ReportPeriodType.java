package org.besduyu.backend.domain.model.enums;

import lombok.Getter;

@Getter
public enum ReportPeriodType {
  DAILY("DAILY"),
  WEEKLY("WEEKLY"),
  MONTHLY("CUSTOMER");

  private final String type;
  ReportPeriodType(String type) {
    this.type = type;
  }
}
