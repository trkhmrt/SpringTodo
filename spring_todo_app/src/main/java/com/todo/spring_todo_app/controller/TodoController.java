package com.todo.spring_todo_app.controller;

import com.todo.spring_todo_app.model.Todo;
import com.todo.spring_todo_app.services.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping("/getAlltodo")
    public ResponseEntity<List<Todo>> getAllTodo() {

        List<Todo> todos = todoService.getAllTodos();

        return ResponseEntity.ok(todos);

    }
    @GetMapping("/getTodo/{id}")
    public ResponseEntity<Todo> getTodo(@RequestParam Long id) {

        Optional<Todo> foundedTodo = todoService.getTodoById(id);

        return ResponseEntity.ok(foundedTodo.get());

    }



}
