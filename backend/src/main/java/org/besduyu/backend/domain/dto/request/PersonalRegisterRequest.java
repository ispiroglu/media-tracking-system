package org.besduyu.backend.domain.dto.request;

import java.util.Date;
import lombok.Data;
import org.besduyu.backend.domain.model.enums.ReportPeriodType;

@Data
public class PersonalRegisterRequest {

  private String firstName;
  private String lastName;
  private String email;
  private String phoneNumber;
  private String password;
  private String placeOfBirth;
  private Date birthDate;
  private String address;
  private String occupation;
  private ReportPeriodType reportType;
}
