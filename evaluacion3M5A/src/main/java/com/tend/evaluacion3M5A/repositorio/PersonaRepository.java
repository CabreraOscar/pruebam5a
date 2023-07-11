/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tend.evaluacion3M5A.repositorio;



import com.tend.evaluacion3M5A.modelo.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author carlos
 */
public interface PersonaRepository extends MongoRepository<Persona, Long>{
    
}
