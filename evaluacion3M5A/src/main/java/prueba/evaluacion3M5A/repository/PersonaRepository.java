package prueba.evaluacion3M5A.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;
import prueba.evaluacion3M5A.model.Persona;


public interface PersonaRepository extends MongoRepository<Persona,Long> {

}
