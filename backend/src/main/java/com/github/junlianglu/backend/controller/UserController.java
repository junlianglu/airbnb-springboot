package com.github.junlianglu.backend.controller;

import com.github.junlianglu.backend.dto.UserProfileDTO;
import com.github.junlianglu.backend.model.User;
import com.github.junlianglu.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<UserProfileDTO> getUserProfile(@PathVariable String id) {
        try {
            User user = userService.getUserById(id);
            return ResponseEntity.ok(new UserProfileDTO(user));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
}
