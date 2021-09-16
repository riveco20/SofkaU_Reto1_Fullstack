package com.retounosofka.solucion.service;

import com.retounosofka.solucion.entity.Tarea;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface InterfasServiciosTarea {
    public List<Tarea>listar();
    public Tarea listarId(int id);
    public Tarea save(Tarea tarea);
    public void delete(int id);
    public Tarea upgrade(Tarea tarea);

}
