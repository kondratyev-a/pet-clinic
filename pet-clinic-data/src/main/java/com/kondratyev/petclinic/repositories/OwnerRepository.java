package com.kondratyev.petclinic.repositories;

import com.kondratyev.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner,Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameContainingIgnoreCase(String lastName);
}
