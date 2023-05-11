package org.besduyu.backend.service;

import java.util.Optional;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.besduyu.backend.domain.model.SampleRecord;
import org.besduyu.backend.repository.SampleRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SampleService {

  private final SampleRepository repo;

  public String hello() {
    return "Hello";
  }

  public Optional<SampleRecord> getRecord(UUID id) {
    return repo.findById(id);
  }

  public void postRecord() {
    SampleRecord s = new SampleRecord(null, "evren", "evren");
    repo.save(s);
  }
}
