package com.todo.spring_todo_app.repository;

import com.todo.spring_todo_app.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface TodoRepository extends JpaRepository<Todo,Long> {

}
