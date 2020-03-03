package edu.university.resource;

import edu.university.entity.AbstractEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BaseResource<T extends AbstractEntity> {
    List<T> getList();

    T getById(Integer id);

    T insert(T entity);

    T update(T entity);

    T delete(Integer id);
}
