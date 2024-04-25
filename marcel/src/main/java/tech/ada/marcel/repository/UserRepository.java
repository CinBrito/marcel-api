package tech.ada.marcel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.ada.marcel.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
