package rifqimuhammadaziz.SpringSecurityClient.event.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import rifqimuhammadaziz.SpringSecurityClient.entity.User;
import rifqimuhammadaziz.SpringSecurityClient.event.RegistrationCompleteEvent;
import rifqimuhammadaziz.SpringSecurityClient.service.UserService;

import java.util.UUID;

@Component
@Slf4j
public class RegistrationCompleteEventListener
        implements ApplicationListener<RegistrationCompleteEvent> {

    @Autowired
    private UserService userService;

    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {
        // Create the verification token for the user with link
        User user = event.getUser();
        String token = UUID.randomUUID().toString();
        userService.saveVerificationTokenForUser(token, user);

        // Send mail to user
        String url = event.getApplicationUrl() + "/verifyRegistration?token=" + token;

        // sendVerificationEmail()
        log.info("Click the link to verify your account : {}", url);
    }
}
