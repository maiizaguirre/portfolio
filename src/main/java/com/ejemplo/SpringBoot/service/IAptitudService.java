package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Aptitud;
import java.util.List;


public interface IAptitudService {
    
    public List<Aptitud> verAptitud();

    public void crearAptitud (Aptitud apt);

    public void borrarAptitud (Long id);

    public Aptitud buscarAptitud (Long id);
}