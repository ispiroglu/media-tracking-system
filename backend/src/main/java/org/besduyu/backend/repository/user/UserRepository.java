package org.besduyu.backend.repository.user;

import java.util.Optional;
import java.util.UUID;
import org.besduyu.backend.domain.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, UUID> {

  Optional<User> findByEmail(String email);

}
