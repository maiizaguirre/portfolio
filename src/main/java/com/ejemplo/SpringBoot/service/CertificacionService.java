package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Certificacion;
import com.ejemplo.SpringBoot.repository.CertificacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CertificacionService implements ICertificacionService {
    
    @Autowired
    public CertificacionRepository certRepo;

    @Override
    public List<Certificacion> verCertificacion() {
        return certRepo.findAll();
    }

    @Override
    public void crearCertificacion(Certificacion cert) {
      certRepo.save(cert);
    }

    @Override
    public void borrarCertificacion(Long id) {
      certRepo.deleteById(id);
    }

    @Override
    public Certificacion buscarCertificacion(Long id) {
      return certRepo.findById(id).orElse(null);
    }
}
