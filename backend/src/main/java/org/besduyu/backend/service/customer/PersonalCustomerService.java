package org.besduyu.backend.service.customer;

import lombok.RequiredArgsConstructor;
import org.besduyu.backend.domain.dto.request.PersonalRegisterRequest;
import org.besduyu.backend.domain.model.customer.PersonalCustomer;
import org.besduyu.backend.domain.model.user.User;
import org.besduyu.backend.repository.customer.PersonalCustomerRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PersonalCustomerService {

  private final PersonalCustomerRepository personalCustomerRepository;

  public void createPersonalCustomer(PersonalRegisterRequest request, User user) {
    var customer = PersonalCustomer.builder()
        .firstName(request.getFirstName())
        .lastName(request.getLastName())
        .email(request.getEmail())
        .phoneNumber(request.getPhoneNumber())
        .birthDate(request.getBirthDate())
        .placeOfBirth(request.getPlaceOfBirth())
        .address(request.getAddress())
        .occupation(request.getOccupation())
        .reportType(request.getReportType())
        .build();

    customer.setUser(user);
    personalCustomerRepository.save(customer);
  }
}

