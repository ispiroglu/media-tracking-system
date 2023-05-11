package org.besduyu.backend.controller.admin;

import java.util.UUID;
import org.besduyu.backend.domain.dto.request.CreateSourceRequest;
import org.besduyu.backend.domain.dto.response.CreateSourceResponse;
import org.besduyu.backend.domain.model.source.BaseSource;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

  @PostMapping("/source")
  public CreateSourceResponse createSource(@RequestBody CreateSourceRequest sourceDTO) {
    return new CreateSourceResponse("ispir");
  }

  @GetMapping("/source/{id}")
  public void getSource(@PathVariable UUID id) {

  }

  @GetMapping("/source")
  public void getSources(@RequestParam MultiValueMap<String, String> params) {

  }


  @PutMapping("/source/{id}")
  public void putSource(@PathVariable UUID id, @RequestBody CreateSourceRequest sourceDTO) {

  }

  @DeleteMapping("/source/{id}")
  public void deleteSource(@PathVariable UUID id) {

  }
}
