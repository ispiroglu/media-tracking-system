package org.besduyu.backend.domain.dto.request;

import java.util.UUID;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class CreateInfoRequest {

  private String desc;
  private UUID sourceId;
}
