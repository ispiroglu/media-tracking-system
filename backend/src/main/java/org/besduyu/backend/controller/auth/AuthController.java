package org.besduyu.backend.controller.auth;

import lombok.RequiredArgsConstructor;
import org.besduyu.backend.domain.dto.request.LoginRequest;
import org.besduyu.backend.domain.dto.request.RegisterRequest;
import org.besduyu.backend.domain.dto.response.AuthenticationResponse;
import org.besduyu.backend.service.auth.AuthService;
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

  @PostMapping("/register")
  public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request) {
    return ResponseEntity.ok(service.register(request));
  }

  @PostMapping("/login")
  public ResponseEntity<AuthenticationResponse> register(@RequestBody LoginRequest request) {
    return ResponseEntity.ok(service.login(request));
  }
}
