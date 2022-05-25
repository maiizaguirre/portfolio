package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Hobby;
import com.ejemplo.SpringBoot.repository.HobbyRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HobbyService implements IHobbyService {
    
    @Autowired
    public HobbyRepository hobbyRepo;

    @Override
    public List<Hobby> verHobby() {
        return hobbyRepo.findAll();
    }

    @Override
    public void crearHobby(Hobby per) {
      hobbyRepo.save(per);
    }

    @Override
    public void borrarHobby(Long id) {
      hobbyRepo.deleteById(id);
    }

    @Override
    public Hobby buscarHobby(Long id) {
      return hobbyRepo.findById(id).orElse(null);
    }
}
