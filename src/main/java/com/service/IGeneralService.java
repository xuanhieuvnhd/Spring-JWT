package com.service;

import java.util.Optional;
//Tạo interface IGeneralService chứa các phương thức chúng của các model.
public interface IGeneralService<T> {
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    T save(T t);

    void remove(Long id);
}
