package org.besduyu.backend.domain.model.source;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.util.Date;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Info {
  @Id @GeneratedValue
  private UUID id;
  @ManyToOne
  private Source source;
  private String description;
  private boolean isValid;
  @CreatedDate
  Date createdDate;
}
