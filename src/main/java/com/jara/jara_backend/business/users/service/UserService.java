package com.jara.jara_backend.business.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Service;

import com.jara.jara_backend.business.users.entities.User;
import com.jara.jara_backend.business.users.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findOrCreateUserFromToken(Jwt jwt) {
        Long userId = jwt.getClaim("sub");
        User user = userRepository.findUserById(userId).get();
        if (user == null) {
            user = new User();
            user.setId(userId);
            user.setEmail(jwt.getClaim("email"));
            user.setRole(jwt.getClaim("roles"));
            userRepository.save(user);
        }
        return user;
    }
}
