package org.besduyu.backend.domain.dto.request;

import java.util.Date;
import lombok.Data;

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
  private String reportType;
}
