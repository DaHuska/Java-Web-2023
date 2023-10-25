package softuni.org.mobilele.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import softuni.org.mobilele.model.dto.UserLoginDTO;
import softuni.org.mobilele.service.user.UserService;

@Controller
public class UserLoginController {
    private final UserService userService;

    public UserLoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/logout")
    public String logout() {
        userService.logoutUser();

        return "index";
    }

    @GetMapping("/users/login")
    public String login() {
        return "auth-login";
    }

    @PostMapping("/users/login")
    public String login(UserLoginDTO userLoginDTO) {
        if (userService.loginUser(userLoginDTO)) {
            return "index";
        }

        return "auth-login";
    }
}
