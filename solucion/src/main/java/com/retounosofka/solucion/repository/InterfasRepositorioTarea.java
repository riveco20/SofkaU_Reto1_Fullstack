package com.retounosofka.solucion.repository;


import org.springframework.data.repository.CrudRepository;
import com.retounosofka.solucion.entity.Tarea;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfasRepositorioTarea extends CrudRepository<Tarea,Integer> {

}
