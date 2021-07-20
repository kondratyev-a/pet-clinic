package com.kondratyev.petclinic.repositories;

import com.kondratyev.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
