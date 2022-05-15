package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Certificacion;
import java.util.List;


public interface ICertificacionService {
    
    public List<Certificacion> verCertificacion();

    public void crearCertificacion (Certificacion cert);

    public void borrarCertificacion (Long id);

    public Certificacion buscarCertificacion (Long id);
}
