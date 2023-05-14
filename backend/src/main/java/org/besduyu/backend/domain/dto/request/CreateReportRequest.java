package org.besduyu.backend.domain.dto.request;

import java.util.UUID;
import lombok.Data;

@Data
public class CreateReportRequest {
  private String name;
  private String description;
  private UUID demandId;
}
