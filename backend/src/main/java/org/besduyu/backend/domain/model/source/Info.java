package org.besduyu.backend.domain.model.source;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.util.Date;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Info {
  @Id @GeneratedValue
  private UUID id;
  private String name;
  private String topic;
  @ManyToOne
  @JsonIgnore
  private Source source;
  private String description;
  private boolean isValid;
  @CreatedDate
  Date createdDate;
}