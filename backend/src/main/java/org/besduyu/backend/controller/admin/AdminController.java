package org.besduyu.backend.controller.admin;

import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.besduyu.backend.domain.dto.request.CreateInfoRequest;
import org.besduyu.backend.domain.dto.request.CreateSourceRequest;
import org.besduyu.backend.domain.dto.response.CreateSourceResponse;
import org.besduyu.backend.domain.model.enums.SourceType;
import org.besduyu.backend.domain.model.source.Source;
import org.besduyu.backend.service.admin.AdminService;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {

  private final AdminService adminService;

  @PostMapping("/source")
  public void createSource(@RequestBody CreateSourceRequest sourceDTO) {
    adminService.createSource(sourceDTO);
  }

  @PostMapping("/sourceall")
  public void createSource(@RequestBody List<CreateSourceRequest> sourceDTO) {
    sourceDTO.forEach(dto -> dto.setSourceType(SourceType.TV));
    sourceDTO.forEach(adminService::createSource);
  }

  @GetMapping("/source/{id}")
  public Source getSource(@PathVariable UUID id) {
    return adminService.getSource(id);
  }

  @GetMapping("/source")
  public List<Source> getSources(@RequestParam MultiValueMap<String, String> params) {
    return adminService.getAllSources();
  }

  @PatchMapping("/source/{id}")
  public void putSource(@PathVariable UUID id, @RequestBody CreateSourceRequest sourceDTO) {
    adminService.updateSource(sourceDTO, id);
  }

  @DeleteMapping("/source/{id}")
  public void deleteSource(@PathVariable UUID id) {
    adminService.deleteSource(id);
  }

  @PostMapping("/info")
  public void createInfo(@RequestBody CreateInfoRequest request) {
    adminService.createInfo(request);
  }

  @PostMapping("/infoall")
  public void createInfo(@RequestBody List<CreateInfoRequest> request) {
    request.forEach(adminService::createInfo);
  }

  @GetMapping("/info/{id}")
  public Source getInfo(@PathVariable UUID id) {
    return adminService.getSource(id);
  }

  @GetMapping("/info")
  public List<Source> getInfos(@RequestParam MultiValueMap<String, String> params) {
    return adminService.getAllSources();
  }
}
