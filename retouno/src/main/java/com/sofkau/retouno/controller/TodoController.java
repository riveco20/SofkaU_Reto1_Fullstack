package com.sofkau.retouno.controller;
import com.sofkau.retouno.entity.Todo;
import com.sofkau.retouno.service.InterfasServiciosTodo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("api/todo")
public class TodoController {
    @Autowired
    private InterfasServiciosTodo service;

    @GetMapping(value="api/Todo")
    public Iterable<Todo>listartareas(){
        return service.listar();
    }

    @PostMapping(value = "api/Todo")
    public Todo saveTarea(@RequestBody Todo todo){
        return service.save(todo);
    };

    @PutMapping(value = "api/Todo")
    public Todo update(@RequestBody Todo todo){
        if(todo.getId()!=null){
            return service.save(todo);
        }
        throw new RuntimeException(("No existe el id para actualizar"));
    };

    @DeleteMapping(value = "api/todo")
    public void delete(@PathVariable("id") Integer id){
        service.delete(id);
    };

    @GetMapping(value = "api/{id}/todo")
    public Todo get(@PathVariable("id") Integer id)
    {
        return service.listarId(id);
    }








}
