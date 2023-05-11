package org.besduyu.backend.controller.backoffice;

import java.util.UUID;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/backoffice")
public class BackofficeController {

  @GetMapping("/source")
  public void getSources(@RequestParam MultiValueMap<String, String> params) {

  }

  @GetMapping("/source/{id}")
  public void getSource(@PathVariable UUID id) {

  }

  @GetMapping("/demand")
  public void getDemands(@RequestParam MultiValueMap<String, String> params) {

  }

  @GetMapping("/demand/{id}")
  public void getDemand(@PathVariable UUID id) {

  }

//  @PostMapping("/report")
//  public void postReport(@RequestBody CreateReportRequest request) {
//
//  }
}
