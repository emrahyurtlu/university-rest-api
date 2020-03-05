package edu.university.resource;

import edu.university.entity.Faculty;
import edu.university.repository.FacultyRepo;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("faculties")
@Produces(MediaType.APPLICATION_JSON)
public class FacultyResource extends BaseResourceImpl<Faculty> {
    public FacultyResource() {
        super(new FacultyRepo());
    }
}
