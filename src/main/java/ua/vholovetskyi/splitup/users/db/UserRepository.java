package ua.vholovetskyi.splitup.users.db;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.vholovetskyi.splitup.users.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    boolean existsByUsername(String username);
}
