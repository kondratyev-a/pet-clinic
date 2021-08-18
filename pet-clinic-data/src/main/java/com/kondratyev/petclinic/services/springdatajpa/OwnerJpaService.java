package com.kondratyev.petclinic.services.springdatajpa;

import com.kondratyev.petclinic.model.Owner;
import com.kondratyev.petclinic.repositories.OwnerRepository;
import com.kondratyev.petclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("springdatajpa")
public class OwnerJpaService extends AbstractJpaService<Owner, OwnerRepository> implements OwnerService {

    public OwnerJpaService(OwnerRepository repository) {
        super(repository);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return repository.findByLastName(lastName);
    }

    @Override
    public List<Owner> findAllByLastNameContainingIgnoreCase(String lastName) {
        return repository.findAllByLastNameContainingIgnoreCase(lastName);
    }
}
