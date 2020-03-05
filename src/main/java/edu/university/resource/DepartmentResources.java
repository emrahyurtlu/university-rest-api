package edu.university.resource;

import edu.university.entity.Department;
import edu.university.repository.BaseRepoImpl;
import edu.university.repository.DepartmentRepo;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("departments")
@Produces(MediaType.APPLICATION_JSON)
public class DepartmentResources extends BaseResourceImpl<Department> {
    protected DepartmentResources(BaseRepoImpl repo) {
        super(new DepartmentRepo());
    }
}
