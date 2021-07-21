package com.kondratyev.petclinic.services.map;

import com.kondratyev.petclinic.model.Pet;
import com.kondratyev.petclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class PetMapService extends AbstractMapService<Pet> implements PetService {
}
