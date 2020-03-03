package edu.university.resource;

import edu.university.entity.Term;
import edu.university.repository.TermRepo;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("terms")
@Produces(MediaType.APPLICATION_JSON)
public class TermResource implements BaseResource<Term> {

    private TermRepo termRepo;

    public TermResource() {
        this.termRepo = new TermRepo();
    }

    @GET
    @Override
    public List<Term> getList() {
        return termRepo.getList();
    }

    @GET
    @Path("/{id}")
    @Override
    public Term getById(@PathParam("id") Integer id) {
        System.out.println("Term: getById çalıştı");
        return termRepo.get(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Override
    public Term insert(Term entity) {
        return termRepo.insert(entity);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Override
    public Term update(Term entity) {
        return termRepo.update(entity);
    }

    @DELETE
    @Path("/{id}")
    @Override
    public Term delete(@PathParam("id") Integer id) {
        Term term = termRepo.get(id);
        termRepo.delete(term);
        return term;
    }
}
