package rifqimuhammadaziz.SpringSecurityClient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rifqimuhammadaziz.SpringSecurityClient.entity.VerificationToken;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {
    VerificationToken findByToken(String token);
}
