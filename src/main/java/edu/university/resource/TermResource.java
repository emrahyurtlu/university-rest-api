package edu.university.resource;

import edu.university.entity.Term;
import edu.university.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("terms")
public class TermResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String insert() {
        Term term = new Term("2019-2020 Spring");
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(term);
        session.getTransaction().commit();

        return "Get all terms!";
    }
}
