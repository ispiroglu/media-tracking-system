package org.besduyu.backend.domain.model.demand;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import java.util.Date;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import org.besduyu.backend.domain.model.enums.ReportPeriodType;
import org.besduyu.backend.domain.model.user.User;
import org.springframework.data.annotation.CreatedDate;

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
  private String description;
  private ReportPeriodType reportPeriodType;
  private Date endDate;
  @CreatedDate
  private Date createdAt;
}
