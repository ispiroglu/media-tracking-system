package org.besduyu.backend.config.security;


import jakarta.servlet.Filter;
import java.util.Arrays;
import lombok.RequiredArgsConstructor;
import org.besduyu.backend.config.auth.JwtAuthenticationFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfiguration {

  private final JwtAuthenticationFilter jwtAuthFilter;
  private final AuthenticationProvider authenticationProvider;

  @Bean
  CorsConfigurationSource corsConfigurationSource() {
    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    CorsConfiguration corsConfiguration = new CorsConfiguration();
    corsConfiguration.addAllowedOrigin("*");
    corsConfiguration.setAllowedMethods(Arrays.asList(
        HttpMethod.GET.name(),
        HttpMethod.HEAD.name(),
        HttpMethod.POST.name(),
        HttpMethod.PUT.name(),
        HttpMethod.DELETE.name()));
    corsConfiguration.setMaxAge(1800L);
    source.registerCorsConfiguration("/**", corsConfiguration); // you restrict your path here
    return source;
  }

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    CorsConfiguration corsConfiguration = new CorsConfiguration();

    http
        .csrf().disable()
        .cors().disable()
        .authorizeHttpRequests().anyRequest().permitAll();
//        .authorizeHttpRequests()
//        .requestMatchers("/auth/**").permitAll()
//        .and()
//        .sessionManagement()
//        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//        .and()
//        .authenticationProvider(authenticationProvider)
//        .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);


    return http.build();
  }
}
