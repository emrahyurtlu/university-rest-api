package edu.university.resource;

import edu.university.entity.BaseEntity;
import edu.university.entity.Term;
import edu.university.repository.TermRepo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("terms")
public class TermResource {
    private TermRepo termRepo;

    public TermResource() {
        this.termRepo = new TermRepo();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        Term first = (Term) termRepo.get(1);
        System.out.println(first);
        BaseEntity latest = termRepo.insert(new Term("aa"));
        System.out.println(latest);
        System.out.println(termRepo.getList());
        first.setTermName("ww");
        termRepo.update(first);
        System.out.println(termRepo.getList());
        Term second = (Term) termRepo.get(2);
        termRepo.delete(second);
        System.out.println(termRepo.getList());
        return "Get all terms!";
    }
}
