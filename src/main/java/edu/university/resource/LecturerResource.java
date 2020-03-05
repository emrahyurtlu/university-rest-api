package edu.university.resource;

import edu.university.entity.Lecturer;
import edu.university.repository.LecturerRepo;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("lecturers")
@Produces(MediaType.APPLICATION_JSON)
public class LecturerResource extends BaseResourceImpl<Lecturer> {
    public LecturerResource() {
        super(new LecturerRepo());
    }
}
