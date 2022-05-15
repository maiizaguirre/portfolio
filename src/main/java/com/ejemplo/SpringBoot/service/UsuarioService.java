package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Usuario;
import com.ejemplo.SpringBoot.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {
    
    @Autowired
    public UsuarioRepository userRepo;

    @Override
    public List<Usuario> verUsuarios() {
        return userRepo.findAll();
    }

    @Override
    public void crearUsuario(Usuario user) {
      userRepo.save(user);
    }

    @Override
    public void borrarUsuario(Long id) {
      userRepo.deleteById(id);
    }

    @Override
    public Usuario buscarUsuario(Long id) {
      return userRepo.findById(id).orElse(null);
    }
}

