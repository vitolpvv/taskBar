package com.geekbrains.service.impl;

import com.geekbrains.service.Service;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Basic service implementation.
 * All services could extends this class to provide DRY principe.
 *
 * @param <T> - domain type.
 * @param <ID> - domain id type.
 */
abstract class ServiceImpl<T, ID> implements Service<T, ID> {

    abstract PagingAndSortingRepository<T, ID> getRepository();

    @Override
    public List<T> getAll() {
        return StreamSupport
                .stream(getRepository().findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public T getById(ID id) {
        return getRepository()
                .findById(id)
                .orElse(null);
    }

    @Override
    public T save(T t) {
        return getRepository().save(t);
    }

    @Override
    public void delete(ID id) {
        getRepository().deleteById(id);
    }
}
