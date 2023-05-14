package org.besduyu.backend.domain.dto.request;

import lombok.Data;
import org.besduyu.backend.domain.model.enums.ReportPeriodType;

@Data
public class CreateDemandRequest {
  private String name;
  private String description;
  private ReportPeriodType reportPeriodType;
}
