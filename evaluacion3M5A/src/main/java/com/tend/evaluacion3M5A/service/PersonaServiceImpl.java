/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tend.evaluacion3M5A.service;


import com.tend.evaluacion3M5A.modelo.Persona;
import com.tend.evaluacion3M5A.repositorio.PersonaRepository;
import com.tend.evaluacion3M5A.service.GenericServiceImpl;
import com.tend.evaluacion3M5A.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Service;

/**
 *
 * @author carlos
 */
@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements GenericService<Persona, Long> {

    @Autowired
    PersonaRepository personaRepository;

    @Override
    public CrudRepository<Persona, Long> getDao() {
        return personaRepository;
    }


    
}

   
