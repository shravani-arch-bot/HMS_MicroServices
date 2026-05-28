package com.example.auth_service.service;

import com.example.auth_service.entity.User;
import com.example.auth_service.repository.UserRepository;
import com.example.auth_service.security.JwtUtil;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;

    public AuthService(UserRepository userRepository, JwtUtil jwtUtil) {
        this.userRepository = userRepository;
        this.jwtUtil = jwtUtil;
    }

    public String register(User user) {

        if (userRepository.findByEmail(user.getEmail()) != null) {
            return "User already exists";
        }

        if (user.getRole() == null || user.getRole().isEmpty()) {
            user.setRole("PATIENT");
        }

        userRepository.save(user);

        return "User registered successfully";
    }

    public String login(User user) {

        User existingUser = userRepository.findByEmail(user.getEmail());

        if (existingUser == null) {
            return "User not found";
        }

        if (!existingUser.getPassword().equals(user.getPassword())) {
            return "Invalid password";
        }

        return jwtUtil.generateToken(
                existingUser.getEmail(),
                existingUser.getRole()
        );
    }
}