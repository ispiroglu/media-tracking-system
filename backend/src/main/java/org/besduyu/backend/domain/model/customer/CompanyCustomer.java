package org.besduyu.backend.domain.model.customer;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class CompanyCustomer extends BaseCustomer {

  private String companyName;
  private String companyType;
  private String companyManagerName;
  private String companyEmail;
  private String companyPhoneNumber;
  private String companyReportType;
  private String companyAddress;

}
