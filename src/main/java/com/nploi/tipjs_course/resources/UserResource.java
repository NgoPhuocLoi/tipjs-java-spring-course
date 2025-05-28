package com.nploi.tipjs_course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nploi.tipjs_course.entity.user.UserEntity;
import com.nploi.tipjs_course.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserEntity> getUsers() {
        // This method would typically return a list of users.
        // For now, we return a simple message.
        return userService.getAllUsers();
    }

    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity user) {
        System.out.println(user);
        // This method would typically handle user creation.
        // For now, we return the created user.
        return userService.createUser(user);
    }
}
