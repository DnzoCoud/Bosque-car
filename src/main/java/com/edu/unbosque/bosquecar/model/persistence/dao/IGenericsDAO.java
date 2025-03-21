package com.edu.unbosque.bosquecar.model.persistence.dao;

import java.util.List;

public interface IGenericsDAO<T, K> {
    void save(T entity);
    void update(K id, T entity);
    void delete(K id);
    T findById(K id);
    List<T> findAll();
}
