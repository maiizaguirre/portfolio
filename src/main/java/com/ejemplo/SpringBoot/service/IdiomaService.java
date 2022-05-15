package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Idioma;
import com.ejemplo.SpringBoot.repository.IdiomaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdiomaService implements IIdiomaService {
    
    @Autowired
    public IdiomaRepository idiomaRepo;

    @Override
    public List<Idioma> verIdioma() {
        return idiomaRepo.findAll();
    }

    @Override
    public void crearIdioma(Idioma idioma) {
      idiomaRepo.save(idioma);
    }

    @Override
    public void borrarIdioma(Long id) {
      idiomaRepo.deleteById(id);
    }

    @Override
    public Idioma buscarIdioma(Long id) {
      return idiomaRepo.findById(id).orElse(null);
    }
}
