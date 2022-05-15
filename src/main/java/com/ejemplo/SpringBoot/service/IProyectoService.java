package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    public List<Proyecto> verProyecto();

    public void crearProyecto (Proyecto proyecto);

    public void borrarProyecto (Long id);

    public Proyecto buscarProyecto (Long id);
}
