package org.besduyu.backend.domain.model.customer;

import jakarta.persistence.Entity;
import java.util.Date;
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
public class PersonalCustomer extends BaseCustomer {

  public String firstName;
  public String lastName;
  public String email;
  public String phoneNumber;
  public String placeOfBirth;
  public Date birthDate;
  public String address;
  public String occupation;
  public String reportType;
}
