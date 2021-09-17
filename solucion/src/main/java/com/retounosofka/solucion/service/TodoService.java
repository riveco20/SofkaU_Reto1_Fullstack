package com.retounosofka.solucion.service;


import com.retounosofka.solucion.entity.Todo;
import com.retounosofka.solucion.repository.InterfasRepositorioTodo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class TodoService implements InterfasServiciosTodo {

    @Autowired
    private InterfasRepositorioTodo date;


    @Override
    public List<Todo> listar() {
        return (List<Todo>)date.findAll();
    }

    @Override
    public Todo listarId(int id) {
        Optional<Todo> tarea = date.findById(id);
        return tarea.get();
    };

    @Override
    public Todo save(Todo todo) {
        return date.save(todo);
    }

    @Override
    public void delete(int id) {
        date.findById(id);
    }

    @Override
    public Todo upgrade(Todo todo) {
        Optional<Todo> tarea1 =date.findById(todo.getId());
        return date.save(todo);
    }
}
