package org.besduyu.backend.service.auth;

import lombok.RequiredArgsConstructor;
import org.besduyu.backend.config.auth.JwtService;
import org.besduyu.backend.domain.dto.request.LoginRequest;
import org.besduyu.backend.domain.dto.request.RegisterRequest;
import org.besduyu.backend.domain.dto.response.AuthenticationResponse;
import org.besduyu.backend.domain.model.user.User;
import org.besduyu.backend.repository.user.UserRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

  private final UserRepository repository;
  private final PasswordEncoder passwordEncoder;
  private final AuthenticationManager authenticationManager;
  private final JwtService jwtService;

  public AuthenticationResponse register(RegisterRequest request) {
    var user = User.builder()
        .email(request.getEmail())
        .password(passwordEncoder.encode(request.getPassword()))
        .build();

    repository.save(user);
    String token = jwtService.generateToken(user);
    return AuthenticationResponse.builder().token(token).build();
  }

  public AuthenticationResponse login(LoginRequest request) {
    authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(
            request.getEmail(),
            request.getPassword()
        )
    );
    User user = repository.findByEmail(request.getEmail())
        .orElseThrow();
    String token = jwtService.generateToken(user);

    return  AuthenticationResponse.builder().token(token).build();
  }
}
