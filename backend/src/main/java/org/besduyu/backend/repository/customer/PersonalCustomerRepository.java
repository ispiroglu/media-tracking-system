package org.besduyu.backend.repository.customer;

import java.util.UUID;
import org.besduyu.backend.domain.model.customer.PersonalCustomer;
import org.springframework.data.repository.CrudRepository;

public interface PersonalCustomerRepository extends CrudRepository<PersonalCustomer, UUID> {
}
