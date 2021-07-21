package com.kondratyev.petclinic.services.map;

import com.kondratyev.petclinic.model.PetType;
import com.kondratyev.petclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class PetTypeMapService extends AbstractMapService<PetType> implements PetTypeService {
}
