package org.besduyu.backend.repository.customer;

import java.util.UUID;
import org.besduyu.backend.domain.model.customer.CompanyCustomer;
import org.springframework.data.repository.CrudRepository;

public interface CompanyCustomerRepository extends CrudRepository<CompanyCustomer, UUID> {
}
