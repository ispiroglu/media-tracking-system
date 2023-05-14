package org.besduyu.backend.domain.model.demand;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import java.util.Date;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import org.besduyu.backend.domain.model.enums.ReportPeriodType;
import org.hibernate.annotations.CreationTimestamp;

@MappedSuperclass
@Getter
@Setter
public class BaseDemand {
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
  @CreationTimestamp
  private Date createdAt;
  @CreationTimestamp
  private Date lastModifiedDate;
}
