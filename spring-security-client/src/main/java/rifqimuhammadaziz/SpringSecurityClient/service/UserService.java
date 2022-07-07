package rifqimuhammadaziz.SpringSecurityClient.service;

import rifqimuhammadaziz.SpringSecurityClient.entity.User;
import rifqimuhammadaziz.SpringSecurityClient.entity.VerificationToken;
import rifqimuhammadaziz.SpringSecurityClient.model.UserModel;

import java.util.Optional;

public interface UserService {
    User save(UserModel userModel);

    void saveVerificationTokenForUser(String token, User user);

    String validateVerificationToken(String token);

    VerificationToken generateNewVerificationToken(String oldToken);

    User findUserByEmail(String email);

    void createPasswordResetTokenForUser(User user, String token);

    String validatePasswordResetToken(String token);

    Optional<User> findUserByPasswordResetToken(String token);

    void changePassword(User user, String newPassword);

    boolean checkIfValidOldPassword(User user, String oldPassword);
}
