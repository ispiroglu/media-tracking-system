package org.besduyu.backend.controller.auth;

import lombok.RequiredArgsConstructor;
import org.besduyu.backend.domain.dto.request.CompanyRegisterRequest;
import org.besduyu.backend.domain.dto.request.LoginRequest;
import org.besduyu.backend.domain.dto.request.PersonalRegisterRequest;
import org.besduyu.backend.domain.dto.request.RegisterRequest;
import org.besduyu.backend.domain.dto.response.AuthenticationResponse;
import org.besduyu.backend.domain.model.user.Role;
import org.besduyu.backend.service.auth.AuthService;
import org.besduyu.backend.service.customer.CompanyCustomerService;
import org.besduyu.backend.service.customer.PersonalCustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/auth")
public class AuthController {

  private final AuthService service;
  private final CompanyCustomerService companyCustomerService;
  private final PersonalCustomerService personalCustomerService;

  @PostMapping("/register")
  public ResponseEntity<AuthenticationResponse> register(
      @RequestBody PersonalRegisterRequest request) {
    var user = service.register(
        RegisterRequest.builder()
            .email(request.getEmail())
            .password(request.getPassword())
            .role(Role.CUSTOMER)
            .build());
    personalCustomerService.createPersonalCustomer(request, user);
    return ResponseEntity.ok(service.generateToken(user));
  }

  @PostMapping("/register/company")
  public ResponseEntity<AuthenticationResponse> register(
      @RequestBody CompanyRegisterRequest request) {
    var user = service.register(
        RegisterRequest.builder()
            .email(request.getCompanyEmail())
            .password(request.getCompanyPassword())
            .role(Role.CUSTOMER)
            .build());
    companyCustomerService.createCompanyCustomer(request, user);
    return ResponseEntity.ok(service.generateToken(user));
  }

  @PostMapping("/login")
  public ResponseEntity<AuthenticationResponse> login(@RequestBody LoginRequest request) {
    return ResponseEntity.ok(service.login(request));
  }
}
