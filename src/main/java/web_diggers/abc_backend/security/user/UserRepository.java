package web_diggers.abc_backend.security.user;

import jakarta.transaction.Transactional;
import web_diggers.abc_backend.security.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findUserByEmail(String email);
    @Transactional
    void deleteUserByEmail(String email);
}
