package com.todo.respository;

import com.todo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TodoRepository extends JpaRepository<Todo,Integer> {
}