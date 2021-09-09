package com.alkemy.disney.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.springframework.lang.NonNull;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", })
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NonNull
    private String nombre;

    private String imagen;

    private Long edad;

    private Long peso;

    private String historia;

    private String pelicula;
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

}
