package com.codegym.appmusic.service;

import java.util.List;

public interface IGenericService<T> {
    List<T> findAll();
    T findById(Long id);
    void save(T model);
    void remove(Long id);
}
