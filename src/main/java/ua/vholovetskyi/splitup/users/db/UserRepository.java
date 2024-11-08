package ua.vholovetskyi.splitup.users.db;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.vholovetskyi.splitup.users.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    Optional<User> findByEmail(String email);

    boolean existsByUsername(String username);
}
