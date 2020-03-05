package edu.university.resource;

import edu.university.entity.Student;
import edu.university.repository.StudentRepo;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("students")
@Produces(MediaType.APPLICATION_JSON)
public class StudentResource extends BaseResourceImpl<Student> {
    protected StudentResource() {
        super(new StudentRepo());
    }
}
