package org.besduyu.backend.service.customer;

import lombok.RequiredArgsConstructor;
import org.besduyu.backend.domain.dto.request.CompanyRegisterRequest;
import org.besduyu.backend.domain.model.customer.CompanyCustomer;
import org.besduyu.backend.domain.model.user.User;
import org.besduyu.backend.repository.customer.CompanyCustomerRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyCustomerService {

  private final CompanyCustomerRepository companyCustomerRepository;

  public void createCompanyCustomer(CompanyRegisterRequest request, User user) {
    var companyCustomer = CompanyCustomer.builder()
        .companyName(request.getCompanyName())
        .companyType(request.getCompanyType())
        .companyManagerName(request.getCompanyManagerName())
        .companyEmail(request.getCompanyEmail())
        .companyPhoneNumber(request.getCompanyPhoneNumber())
        .companyReportType(request.getCompanyReportType())
        .companyAddress(request.getCompanyAddress())
        .build();
    companyCustomer.setUser(user);

    companyCustomerRepository.save(companyCustomer);
  }
}
