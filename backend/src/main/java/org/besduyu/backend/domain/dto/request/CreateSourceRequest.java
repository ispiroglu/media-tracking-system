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
  private String website;
  private String address;
  private String email;
  private String phoneNumber;
  private SourceType sourceType;
}
