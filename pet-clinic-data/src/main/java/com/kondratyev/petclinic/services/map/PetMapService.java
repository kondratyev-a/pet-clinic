package com.kondratyev.petclinic.services.map;

import com.kondratyev.petclinic.model.Pet;
import com.kondratyev.petclinic.services.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetMapService extends AbstractMapService<Pet> implements PetService {
}
