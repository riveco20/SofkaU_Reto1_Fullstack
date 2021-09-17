package com.sofkau.retouno.repository;

import com.sofkau.retouno.entity.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfasRepositorioTodo extends CrudRepository<Todo,Integer> {

}