package com.kondratyev.petclinic.services;

import com.kondratyev.petclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner>{

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameContainingIgnoreCase(String lastName);

}
