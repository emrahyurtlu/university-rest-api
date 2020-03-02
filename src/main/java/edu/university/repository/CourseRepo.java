package edu.university.repository;

import edu.university.entity.Course;

public class CourseRepo extends BaseRepoImpl<Course> {
    /*private Session session;

    public CourseRepo() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public Course get(Integer id) throws ObjectNotFoundException {
        return session.find(Course.class, id);
    }

    @Override
    public List<Course> getList() {
        List<Course> resultList = session.createQuery("FROM Course").getResultList();
        return resultList;
    }

    @Override
    public Course insert(Course entity) {
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        return entity;
    }

    @Override
    public Course update(Course entity) {
        session.beginTransaction();
        session.update(entity);
        session.getTransaction().commit();
        return entity;
    }

    @Override
    public void delete(Course entity) {
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
    }*/
}
