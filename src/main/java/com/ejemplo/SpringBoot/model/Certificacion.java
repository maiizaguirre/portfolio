package com.ejemplo.SpringBoot.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Certificacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 

    private String institucion;    
    private String titulo;
    private String descripcion;
    
    public Certificacion (Long id, String institucion, String titulo, String descripcion) {
        this.id = id;
        this.institucion = institucion;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }
}