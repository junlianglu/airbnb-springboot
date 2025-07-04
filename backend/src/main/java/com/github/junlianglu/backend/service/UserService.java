package com.github.junlianglu.backend.service;

import com.github.junlianglu.backend.model.User;
import com.github.junlianglu.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(String id) throws Exception {
        return userRepository.findById(id)
                .orElseThrow(() -> new Exception("User not found"));
    }
}