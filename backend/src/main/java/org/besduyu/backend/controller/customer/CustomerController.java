package org.besduyu.backend.controller.customer;

import java.util.UUID;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
  // TODO: Get Session from getAuthentication() - getPrincipal()
  private final UUID customerID = UUID.randomUUID();

  @PostMapping("/demand")
  public void postDemand(@RequestParam MultiValueMap<String, String> params) {

  }

  @GetMapping("/demand")
  public void getDemands(@RequestParam MultiValueMap<String, String> params) {

  }

  @GetMapping("/demand/{id}")
  public void getDemand(@PathVariable UUID id) {

  }
}
