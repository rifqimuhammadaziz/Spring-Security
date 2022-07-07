package rifqimuhammadaziz.SpringSecurityClient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rifqimuhammadaziz.SpringSecurityClient.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByEmail(String email);
}
