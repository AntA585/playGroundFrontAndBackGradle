package com.anthony.playgroundwebbackend.repository;

import com.anthony.playgroundwebbackend.data.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepository extends MongoRepository<ToDo,String> {
    
}