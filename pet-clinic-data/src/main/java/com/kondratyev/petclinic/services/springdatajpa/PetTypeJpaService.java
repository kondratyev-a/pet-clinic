package com.kondratyev.petclinic.services.springdatajpa;

import com.kondratyev.petclinic.model.PetType;
import com.kondratyev.petclinic.repositories.PetTypeRepository;
import com.kondratyev.petclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class PetTypeJpaService extends AbstractJpaService<PetType, PetTypeRepository> implements PetTypeService {

    public PetTypeJpaService(PetTypeRepository repository) {
        super(repository);
    }
}
