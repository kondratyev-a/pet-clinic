package com.kondratyev.petclinic.services.map;

import com.kondratyev.petclinic.model.PetType;
import com.kondratyev.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class PetTypeMapService extends AbstractMapService<PetType> implements PetTypeService {
}
