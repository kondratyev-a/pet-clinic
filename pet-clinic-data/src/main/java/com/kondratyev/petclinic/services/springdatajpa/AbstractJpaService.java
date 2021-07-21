package com.kondratyev.petclinic.services.springdatajpa;

import com.kondratyev.petclinic.model.BaseEntity;
import com.kondratyev.petclinic.services.CrudService;
import org.springframework.data.repository.CrudRepository;

import java.util.HashSet;
import java.util.Set;

public class AbstractJpaService<T extends BaseEntity, R extends CrudRepository<T,Long>> implements CrudService<T> {

    protected final R repository;

    public AbstractJpaService(R repository) {
        this.repository = repository;
    }

    @Override
    public Set<T> findAll() {
        Set<T> objects = new HashSet<>();
        repository.findAll().forEach(objects::add);
        return objects;
    }

    @Override
    public T findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public T save(T object) {
        return repository.save(object);
    }

    @Override
    public void delete(T object) {
        repository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
