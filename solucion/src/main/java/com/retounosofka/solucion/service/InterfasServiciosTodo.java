package com.retounosofka.solucion.service;

import com.retounosofka.solucion.entity.Todo;

import java.util.List;

public interface InterfasServiciosTodo {
    public List<Todo>listar();
    public Todo listarId(int id);
    public Todo save(Todo todo);
    public void delete(int id);
    public Todo upgrade(Todo todo);

}
