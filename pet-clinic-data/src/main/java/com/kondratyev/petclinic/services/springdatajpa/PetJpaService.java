package com.kondratyev.petclinic.services.springdatajpa;

import com.kondratyev.petclinic.model.Pet;
import com.kondratyev.petclinic.repositories.PetRepository;
import com.kondratyev.petclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class PetJpaService extends AbstractJpaService<Pet,PetRepository> implements PetService {

    public PetJpaService(PetRepository repository) {
        super(repository);
    }
}
