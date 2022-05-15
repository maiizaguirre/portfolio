package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Perfil;
import java.util.List;


public interface IPerfilService {
    
    public List<Perfil> verPerfil();

    public void crearPerfil (Perfil per);

    public void borrarPerfil (Long id);

    public Perfil buscarPerfil (Long id);
}
