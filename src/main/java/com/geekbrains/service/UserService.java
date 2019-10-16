package com.geekbrains.service;

import com.geekbrains.domain.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends Service<User, Long>, UserDetailsService {

    User getByUsername(String name);

    User getByEmail(String email);
}
