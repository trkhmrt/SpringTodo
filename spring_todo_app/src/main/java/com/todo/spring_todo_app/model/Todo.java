package com.todo.spring_todo_app.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
//@Table(name="TODO")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private boolean completed;

    @ManyToOne
    @JoinColumn(name = "user_id")
    public User user;


    /*

    İLİŞKİ TİPİ

    Her user -> Kendisine birden fazla görevb oluşturabilirim.
    Her görev -> Sadece bir usera ait olabilir.



     One -> User
     Many -> Todo



    */

}
