package edu.university.resource;

import edu.university.entity.AbstractEntity;

import java.util.List;

public interface BaseResource<T extends AbstractEntity> {
    List<T> getList();

    T getById(Integer id);

    T insert(T entity);

    T update(T entity);

    T delete(Integer id);
}
