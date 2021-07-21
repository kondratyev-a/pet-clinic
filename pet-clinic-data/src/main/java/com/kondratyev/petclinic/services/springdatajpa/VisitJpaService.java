package com.kondratyev.petclinic.services.springdatajpa;

import com.kondratyev.petclinic.model.Visit;
import com.kondratyev.petclinic.repositories.VisitRepository;
import com.kondratyev.petclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class VisitJpaService extends AbstractJpaService<Visit, VisitRepository> implements VisitService {
    public VisitJpaService(VisitRepository repository) {
        super(repository);
    }
}
