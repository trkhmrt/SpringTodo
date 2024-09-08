package com.todo.spring_todo_app.controller;


import com.todo.spring_todo_app.model.User;
import com.todo.spring_todo_app.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@AllArgsConstructor
public class AuthController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        boolean isAuthenticated = userService.authenticate(user.getUsername(), user.getPassword());

        if (isAuthenticated) {
            return "Login successful";
        } else {
            return "Invalid username or password";
        }
    }

}
