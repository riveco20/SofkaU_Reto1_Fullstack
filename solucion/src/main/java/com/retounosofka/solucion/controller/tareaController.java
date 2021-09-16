package com.retounosofka.solucion.controller;


import com.retounosofka.solucion.entity.Tarea;
import com.retounosofka.solucion.service.InterfasServiciosTarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.retounosofka.solucion.repository.InterfasRepositorioTarea;

@RestController

@cross
@RequestMapping("api")
public class tareaController  {
    @Autowired
    private InterfasServiciosTarea service;

    @GetMapping(value="api/listarTarea")
    public Iterable<Tarea>listartareas(){
         return service.listar();
    }

    @PostMapping(value = "api/guardarPersona")
    public Tarea saveTarea(@RequestBody Tarea tarea){
        return service.save(tarea);
    };

    @PutMapping(value = "api/tarea")
    public Tarea update(@RequestBody Tarea tarea){
        if(tarea.getId()!=null){
            return service.save(tarea);
        }
        throw new RuntimeException(("No existe el id para actualizar"));
    };

   @DeleteMapping(value = "api/tarea")
    public void delete(@PathVariable("id") Integer id){
        service.delete(id);
   };

   @GetMapping(value = "api/{id}/tarea")
    public Tarea get(@PathVariable("id") Integer id)
   {
       return service.listarId(id);
   }








}
