package edu.university.repository;

import edu.university.entity.BaseEntity;
import edu.university.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class BaseRepoImpl<T extends BaseEntity> implements BaseRepo<T> {
    private Session session;

    public BaseRepoImpl() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public T get(Integer id) {
        return session.find(Class.forName(T), id);
    }

    @Override
    public List<T> getList() {
        return session.createQuery("FROM " + BaseRepoImpl.class).getResultList();
    }

    @Override
    public T insert(T entity) {
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        return entity;
    }

    @Override
    public T update(BaseEntity entity) {
        session.beginTransaction();
        session.update(entity);
        session.getTransaction().commit();
        return (T) entity;
    }

    @Override
    public void delete(T entity) {
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
    }
}
