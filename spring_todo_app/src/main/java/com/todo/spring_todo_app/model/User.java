package com.todo.spring_todo_app.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data

//@Table(name="User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;

    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL , orphanRemoval = true)
    public List<Todo> todos;
    
    


}
