package com.geekbrains.controller;

import com.geekbrains.domain.Role;
import com.geekbrains.domain.User;
import com.geekbrains.service.UserService;
import com.geekbrains.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;

@Controller
public class RegistrationController {

    private static final String REGISTRATION_MAPPING = "/registration";
    private static final String VIEW = "registration";
    private static final String REDIRECTION = "/login" ;
    private static final String ATTRIBUTE = "message";

    @Autowired
    private UserServiceImpl userService;

    @GetMapping(REGISTRATION_MAPPING)
    public String registration() {
        return VIEW;
    }

    @PostMapping(REGISTRATION_MAPPING)
    public String save(@RequestParam String username, String password, Model model) {
        User user = new User();
        String result = null;
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        password = encoder.encode(password);


        System.out.println("yes!");

        User userFromDB = userService.getByUsername(username);
        if (userFromDB != null) {
            System.out.println("yes!if!");
            model.addAttribute(ATTRIBUTE, "User exists!");
            result = REGISTRATION_MAPPING;
        } else {
            System.out.println("yes!else!");
            user.setUsername(username);
            user.setPassword(password);
            user.setActive(true);
            user.setRoles(Collections.singleton(Role.USER));

            userService.save(user);
            result = REDIRECTION;
        }

        return result;

    }

}
