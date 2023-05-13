package org.besduyu.backend.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.besduyu.backend.domain.model.enums.SourceType;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateSourceRequest {
  private String name;
  private SourceType sourceType;
}
