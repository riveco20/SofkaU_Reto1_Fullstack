package com.retounosofka.solucion.service;


import com.retounosofka.solucion.entity.Tarea;
import com.retounosofka.solucion.repository.InterfasRepositorioTarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class TareaService implements InterfasServiciosTarea {

    @Autowired
    private InterfasRepositorioTarea date;


    @Override
    public List<Tarea> listar() {
        return (List<Tarea>)date.findAll();
    }

    @Override
    public Tarea listarId(int id) {
        Optional<Tarea> tarea = date.findById(id);
        return tarea.get();
    };

    @Override
    public Tarea save(Tarea tarea) {
        return date.save(tarea);
    }

    @Override
    public void delete(int id) {
        date.findById(id);
    }

    @Override
    public Tarea upgrade(Tarea tarea) {
        Optional<Tarea> tarea1 =date.findById(tarea.getId());
        return date.save(tarea);
    }
}
