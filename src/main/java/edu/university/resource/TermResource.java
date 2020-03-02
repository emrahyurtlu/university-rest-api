package edu.university.resource;

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
        Term term = termRepo.get(1);
        termRepo.delete(term);
        System.out.println(termRepo.getList());
        return "Get all terms!";
    }
}
