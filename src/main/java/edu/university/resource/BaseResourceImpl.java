package edu.university.resource;

import edu.university.entity.AbstractEntity;
import edu.university.repository.BaseRepoImpl;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
public abstract class BaseResourceImpl<T extends AbstractEntity> implements BaseResource<T> {
    private BaseRepoImpl repo;

    protected BaseResourceImpl(BaseRepoImpl repo) {
        this.repo = repo;
    }

    @GET
    @Override
    public List<T> getList() {
        return repo.getList();
    }

    @GET
    @Path("/{id}")
    @Override
    public T getById(@PathParam("id") Integer id) {
        return (T) repo.get(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Override
    public T insert(T entity) {
        return (T) repo.insert(entity);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Override
    public T update(T entity) {
        return (T) repo.update(entity);
    }

    @DELETE
    @Path("/{id}")
    @Override
    public T delete(@PathParam("id") Integer id) {
        T entity = (T) repo.get(id);
        repo.delete(entity);
        return entity;
    }
}
