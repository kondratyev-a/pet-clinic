package com.kondratyev.petclinic.services;

import com.kondratyev.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner>{

    Owner findByLastName(String lastName);

}
