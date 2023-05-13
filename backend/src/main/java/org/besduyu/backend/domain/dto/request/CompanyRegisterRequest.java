package org.besduyu.backend.domain.dto.request;

import lombok.Data;

@Data
public class CompanyRegisterRequest {

  private String companyName;
  private String companyType;
  private String companyManagerName;
  private String companyEmail;
  private String companyPhoneNumber;
  private String companyPassword;
  private String companyReportType;
  private String companyAddress;
}
