package com.im.springbootprometheusgrafana.controller;

import com.im.springbootprometheusgrafana.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("")
    public List<User> getUsers() {
        return List.of(new User(1L, "Abc", "Def", 20),
                new User(2L, "Tuv", "Xyz", 30)
        );
    }
}
