package rifqimuhammadaziz.SpringSecurityClient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rifqimuhammadaziz.SpringSecurityClient.entity.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {
    PasswordResetToken findByToken(String token);
}
