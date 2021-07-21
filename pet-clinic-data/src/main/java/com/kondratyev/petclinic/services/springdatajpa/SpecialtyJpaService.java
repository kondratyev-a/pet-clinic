package com.kondratyev.petclinic.services.springdatajpa;

import com.kondratyev.petclinic.model.Speciality;
import com.kondratyev.petclinic.repositories.SpecialtyRepository;
import com.kondratyev.petclinic.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class SpecialtyJpaService extends AbstractJpaService<Speciality,SpecialtyRepository> implements SpecialtyService {

    public SpecialtyJpaService(SpecialtyRepository repository) {
        super(repository);
    }
}