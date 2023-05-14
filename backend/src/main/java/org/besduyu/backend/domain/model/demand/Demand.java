package org.besduyu.backend.domain.model.demand;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToOne;
import java.util.Date;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.besduyu.backend.domain.model.enums.ReportPeriodType;
import org.besduyu.backend.domain.model.report.Report;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Demand {
  @Id
  @GeneratedValue
  private UUID id;
//  @ManyToOne
//  @JoinColumn(name = "user_id", nullable = false, table = "_user")
//  private User user;
  private String name;
  private String description;
  private ReportPeriodType reportPeriodType;
  private Date deadline;
  private boolean active;
  @OneToOne
  private Report report;
  @CreationTimestamp
  private Date createdAt;
  @CreationTimestamp
  private Date lastModifiedDate;
}
