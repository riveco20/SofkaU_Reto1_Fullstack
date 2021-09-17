package com.retounosofka.solucion.repository;


import com.retounosofka.solucion.entity.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfasRepositorioTodo extends CrudRepository<Todo,Integer> {

}
