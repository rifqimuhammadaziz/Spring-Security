package rifqimuhammadaziz.SpringSecurityClient.service;

import rifqimuhammadaziz.SpringSecurityClient.entity.User;
import rifqimuhammadaziz.SpringSecurityClient.entity.VerificationToken;
import rifqimuhammadaziz.SpringSecurityClient.model.UserModel;

public interface UserService {
    User save(UserModel userModel);

    void saveVerificationTokenForUser(String token, User user);

    String validateVerificationToken(String token);

    VerificationToken generateNewVerificationToken(String oldToken);
}
