package org.besduyu.backend.domain.model.source;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.besduyu.backend.domain.model.enums.SourceType;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Source {
  @Id
  @GeneratedValue
  private UUID id;
  private String name;
  private SourceType sourceType;
  @OneToMany()
  private List<Info> infoList;
  @CreatedDate
  private Date createdAt;
  @LastModifiedDate
  private Date lastModifiedDate;
}
