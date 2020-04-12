package com.csye.ToyApplication.user;

import com.csye.ToyApplication.authentication.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
@Controller
public class UserController {


    @Autowired
    private AuthenticationService authService;

    @Autowired
    private UserService userService;

    @GetMapping("/users/current")
    public User getCurrentUser(@RequestHeader("authorization") String authHeader) {
        String email = authService.getLoggedInUserEmail(authHeader);
        User user = userService.findUserByEmail(email);
        user.setPassword(null);
        return user;
    }

}
