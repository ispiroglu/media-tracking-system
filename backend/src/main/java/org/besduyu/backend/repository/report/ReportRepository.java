package org.besduyu.backend.repository.report;

import java.util.UUID;
import org.besduyu.backend.domain.model.report.Report;
import org.springframework.data.repository.CrudRepository;

public interface ReportRepository extends CrudRepository<Report, UUID> {
}
