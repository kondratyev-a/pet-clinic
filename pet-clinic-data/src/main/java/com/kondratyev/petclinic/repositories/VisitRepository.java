package com.kondratyev.petclinic.repositories;

import com.kondratyev.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
