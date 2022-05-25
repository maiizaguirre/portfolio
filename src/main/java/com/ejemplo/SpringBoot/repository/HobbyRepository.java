package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.model.Hobby;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HobbyRepository extends JpaRepository <Hobby, Long> {
    
}
