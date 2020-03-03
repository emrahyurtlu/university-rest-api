package edu.university.repository;

import edu.university.entity.AbstractEntity;
import edu.university.util.HibernateUtil;
import org.hibernate.Session;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public abstract class BaseRepoImpl<T extends AbstractEntity> implements BaseRepo<T> {
    private Class<T> entityType;
    private Session session;

    BaseRepoImpl(Class<T> entityType) {
        this.session = HibernateUtil.getSessionFactory().openSession();
        this.entityType = entityType;
    }

    @Override
    public T get(Integer id) {
        return session.find(entityType, id);
    }

    @Override
    public List<T> getList() {
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = builder.createQuery(entityType);
        criteriaQuery.from(entityType);
        return session.createQuery(criteriaQuery).getResultList();
    }

    @Override
    public T insert(T entity) {
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        return entity;
    }

    @Override
    public T update(T entity) {
        session.beginTransaction();
        session.update(entity);
        session.getTransaction().commit();
        return entity;
    }

    @Override
    public void delete(T entity) {
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
    }
}
