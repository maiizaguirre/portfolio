package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.model.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository extends JpaRepository <Perfil, Long> {
    
}
