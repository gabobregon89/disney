package com.alkemy.disney.controller;

import com.alkemy.disney.entity.Personaje;
import com.alkemy.disney.repository.PersonajeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonajeController {
    
    @Autowired
    private PersonajeRepository personajeRepository;

    @RequestMapping(value = "/personajes", method = RequestMethod.POST)
    public Personaje creandoPersonaje(@RequestBody Personaje personaje) {
        return personajeRepository.save(personaje);
    }

    @RequestMapping(value = "/personajes", method = RequestMethod.GET)
    public ResponseEntity<?> getAll() {
        return new ResponseEntity(personajeRepository.findAll(), HttpStatus.OK);
    }
    
}
