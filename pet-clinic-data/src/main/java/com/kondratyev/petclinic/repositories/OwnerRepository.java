package com.kondratyev.petclinic.repositories;

import com.kondratyev.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
}
