package com.yashwant.todoapp.repository;

import com.yashwant.todoapp.entities.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity, Long> {

}
