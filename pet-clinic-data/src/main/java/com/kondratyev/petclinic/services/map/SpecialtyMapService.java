package com.kondratyev.petclinic.services.map;

import com.kondratyev.petclinic.model.Speciality;
import com.kondratyev.petclinic.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class SpecialtyMapService extends AbstractMapService<Speciality> implements SpecialtyService {

}
