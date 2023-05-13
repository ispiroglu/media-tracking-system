package org.besduyu.backend.domain.model.customer;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Builder
public class CompanyCustomer extends BaseCustomer {

  public String companyName;
  public String companyType;
  public String companyManagerName;
  public String companyEmail;
  public String companyPhoneNumber;
  public String companyReportType;
  public String companyAddress;
}
