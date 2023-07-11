package prueba.evaluacion3M5A.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import prueba.evaluacion3M5A.model.Persona;
import prueba.evaluacion3M5A.repository.PersonaRepository;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona,Long> implements GenericService<Persona,Long>{


    @Autowired
    PersonaRepository personaRepository;

    @Override
    public CrudRepository<Persona, Long> getDao(){return personaRepository;}
}
