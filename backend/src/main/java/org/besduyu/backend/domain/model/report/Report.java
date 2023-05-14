package org.besduyu.backend.domain.model.report;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import java.util.Date;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.besduyu.backend.domain.model.demand.Demand;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Report {
  @Id @GeneratedValue
  private UUID id;
  private String name;
  private String description;
  @OneToOne
  private Demand demand;
  @CreationTimestamp
  private Date createdAt;
}

