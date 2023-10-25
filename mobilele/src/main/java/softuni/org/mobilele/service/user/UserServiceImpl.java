package softuni.org.mobilele.service.user;

import org.springframework.stereotype.Service;
import softuni.org.mobilele.model.dto.UserLoginDTO;
import softuni.org.mobilele.model.dto.UserRegistrationDTO;
import softuni.org.mobilele.model.entity.User;
import softuni.org.mobilele.repository.UserRepository;
import softuni.org.mobilele.util.CurrentUser;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final CurrentUser currentUser;

    public UserServiceImpl(UserRepository userRepository, CurrentUser currentUser) {
        this.userRepository = userRepository;
        this.currentUser = currentUser;
    }

    @Override
    public void registerUser(UserRegistrationDTO userRegistrationDTO) {
        userRepository.save(map(userRegistrationDTO));
    }

    @Override
    public boolean loginUser(UserLoginDTO userLoginDTO) {
        Optional<User> foundUser = userRepository
                .findByUsername(userLoginDTO.username());

        boolean isLoginSuccess = false;

        if (foundUser.isPresent()) {
            String password = userLoginDTO.password();
            String inputPassword = foundUser.get().getPassword();

            isLoginSuccess = password.equals(inputPassword);

            if (isLoginSuccess) {
                currentUser
                        .setLogged(true)
                        .setFirstName(foundUser.get().getFirstName())
                        .setLastName(foundUser.get().getLastName());
            }
        }

        return isLoginSuccess;
    }

    @Override
    public void logoutUser() {
        currentUser.logout();
    }

    private static User map(UserRegistrationDTO userRegistrationDTO) {
        return new User()
                .setActive(true)
                .setFirstName(userRegistrationDTO.firstName())
                .setLastName(userRegistrationDTO.lastName())
                .setPassword(userRegistrationDTO.password())
                .setUsername(userRegistrationDTO.username());
    }
}
