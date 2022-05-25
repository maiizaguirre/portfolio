package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Idioma;
import java.util.List;


public interface IIdiomaService {
    
    public List<Idioma> verIdioma();

    public void crearIdioma (Idioma per);

    public void borrarIdioma (Long id);

    public Idioma buscarIdioma (Long id);
}