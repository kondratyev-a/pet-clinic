package com.kondratyev.petclinic.repositories;

import com.kondratyev.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
