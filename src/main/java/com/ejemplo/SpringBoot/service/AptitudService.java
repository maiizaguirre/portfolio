package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Aptitud;
import com.ejemplo.SpringBoot.repository.AptitudRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AptitudService implements IAptitudService {
    
    @Autowired
    public AptitudRepository aptRepo;

    @Override
    public List<Aptitud> verAptitud() {
        return aptRepo.findAll();
    }

    @Override
    public void crearAptitud(Aptitud apt) {
      aptRepo.save(apt);
    }

    @Override
    public void borrarAptitud(Long id) {
      aptRepo.deleteById(id);
    }

    @Override
    public Aptitud buscarAptitud(Long id) {
      return aptRepo.findById(id).orElse(null);
    }
}