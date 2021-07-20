package com.kondratyev.petclinic.repositories;

import com.kondratyev.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
