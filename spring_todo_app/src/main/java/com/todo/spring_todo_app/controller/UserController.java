package com.todo.spring_todo_app.controller;


import com.todo.spring_todo_app.model.User;
import com.todo.spring_todo_app.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {
@Autowired
private UserService userService;

@GetMapping
public ResponseEntity<List<User>> getAllUsers() {

    return ResponseEntity.ok(userService.getAllUsers());
}



    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUserbyID(id);
        return ResponseEntity.noContent().build();
    }
    @PostMapping("/saveUser")
    public ResponseEntity<String> createUser(@RequestBody User user) {

        userService.saveUser(user);

        return ResponseEntity.ok("User Saved");
    }


    @PutMapping("/updateUser/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable Long id) {
        User updatedUser = userService.updateUser(user);
        return ResponseEntity.ok(updatedUser);
    }

}
