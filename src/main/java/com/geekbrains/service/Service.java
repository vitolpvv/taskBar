package com.geekbrains.service;

import java.util.List;

public interface Service<T, ID> {

    List<T> getAll();

    T getById(ID id);

    T save(T t);

    void delete(ID id);
}
