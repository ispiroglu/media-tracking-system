package org.besduyu.backend.controller;

import java.util.Optional;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.besduyu.backend.domain.model.SampleRecord;
import org.besduyu.backend.service.SampleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/db")
public class SampleController {

  private final SampleService service;

  @GetMapping("/{id}")
  public Optional<SampleRecord> getRecord(@PathVariable UUID id) {
    return service.getRecord(id);
  }

  @PostMapping("/")
  public void postRecord() {
    service.postRecord();
  }
}
