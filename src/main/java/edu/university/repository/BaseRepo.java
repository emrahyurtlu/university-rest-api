package edu.university.repository;

import edu.university.entity.BaseEntity;

import java.util.List;

public interface BaseRepo<T extends BaseEntity> {
    T get(Integer id);

    List<T> getList();

    T insert(T entity);

    T update(T entity);

    void delete(T entity);
}