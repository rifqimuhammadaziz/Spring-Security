package rifqimuhammadaziz.oauthauthorizationserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rifqimuhammadaziz.oauthauthorizationserver.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByEmail(String email);
}
