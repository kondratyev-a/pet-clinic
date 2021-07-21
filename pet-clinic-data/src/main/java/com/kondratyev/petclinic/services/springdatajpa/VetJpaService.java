package com.kondratyev.petclinic.services.springdatajpa;

import com.kondratyev.petclinic.model.Vet;
import com.kondratyev.petclinic.repositories.VetRepository;
import com.kondratyev.petclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class VetJpaService extends AbstractJpaService<Vet, VetRepository> implements VetService {

    public VetJpaService(VetRepository repository) {
        super(repository);
    }
}
