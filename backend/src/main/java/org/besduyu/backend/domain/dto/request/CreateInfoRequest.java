package org.besduyu.backend.domain.dto.request;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateInfoRequest {

  private String name;
  private String topic;
  private String desc;
  private UUID sourceId;
}
