package com.kondratyev.petclinic.services;

import java.util.Set;

public interface CrudService<T> {

    Set<T> findAll();

    T findById(Long id);

    T save(T object);

    void delete(T object);

    void deleteById(Long id);
}
