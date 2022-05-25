package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Hobby;
import java.util.List;


public interface IHobbyService {
    
    public List<Hobby> verHobby();

    public void crearHobby (Hobby hobby);

    public void borrarHobby (Long id);

    public Hobby buscarHobby (Long id);
}
