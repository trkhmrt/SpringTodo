package com.todo.spring_todo_app.services;

import com.todo.spring_todo_app.repository.UserRepository;

import com.todo.spring_todo_app.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {


    private final UserRepository userRepository;


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public Optional <User> getUserById (Long id) {
        return userRepository.findById(id);
    }
    public void saveUser (User user) {
        userRepository.save(user);
    }
    public void deleteUserbyID (Long id) {
        userRepository.deleteById(id);
    }

    public User updateUser (User user) {
        return userRepository.save(user);
    }

    public boolean authenticate(String username, String rawPassword) {
        User user = userRepository.findByUsername(username);

        if (user != null) {
            if(rawPassword.equals(user.getPassword())) {
                return true;
            }

        }

        return false;
    }



}