package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.model.Idioma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdiomaRepository extends JpaRepository <Idioma, Long> {
    
}
