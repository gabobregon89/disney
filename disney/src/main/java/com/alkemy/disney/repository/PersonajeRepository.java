package com.alkemy.disney.repository;

import java.util.List;

import com.alkemy.disney.entity.Personaje;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajeRepository extends CrudRepository<Personaje, Long>{
    
    List<Personaje> findAll();
}
