package com.todo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Todo {
    @Id
    private int id;
    @Setter
    @Getter
    private String text;
    @Setter
    private boolean done;


    public boolean getDone() {
        return done;
    }
}
