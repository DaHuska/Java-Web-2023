package softuni.org.mobilele.service.user;

import softuni.org.mobilele.model.dto.UserLoginDTO;
import softuni.org.mobilele.model.dto.UserRegistrationDTO;

public interface UserService {
    void registerUser(UserRegistrationDTO userRegistrationDTO);

    boolean loginUser(UserLoginDTO userLoginDTO);

    void logoutUser();
}
