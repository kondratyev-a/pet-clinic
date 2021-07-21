package com.kondratyev.petclinic.services.map;

import com.kondratyev.petclinic.model.BaseEntity;
import com.kondratyev.petclinic.services.CrudService;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity> implements CrudService<T> {

    protected Map<Long, T> map = new HashMap<>();

    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    public T findById(Long id) {
        return map.get(id);
    }

    public T save(T object) {

        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object can't be null");
        }

        return object;
    }

    public void deleteById(Long id) {
        map.remove(id);
    }

    public void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId() {
        return map.isEmpty()? 1L : Collections.max(map.keySet()) + 1;
    }
}