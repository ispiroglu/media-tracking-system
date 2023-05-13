package org.besduyu.backend.domain.model.customer;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import lombok.Data;
import org.besduyu.backend.domain.model.demand.ReportDemand;
import org.besduyu.backend.domain.model.user.User;
import org.springframework.data.annotation.CreatedDate;

@MappedSuperclass
@Data
public class BaseCustomer {

  @Id @GeneratedValue
  public UUID id;
  @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  @JoinColumn (name = "user_id", referencedColumnName = "id")
  public User user;
//  @OneToMany(mappedBy = "user")
//  private List<ReportDemand> reportDemandList;
  @CreatedDate public Date createdDate;
}
