package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.model.Aptitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AptitudRepository extends JpaRepository <Aptitud, Long> {
    
}
