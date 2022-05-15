package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.model.Certificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificacionRepository extends JpaRepository <Certificacion, Long> {
    
}