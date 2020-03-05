package edu.university.resource;

import edu.university.entity.Course;
import edu.university.repository.BaseRepoImpl;
import edu.university.repository.CourseRepo;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("courses")
@Produces(MediaType.APPLICATION_JSON)
public class CourseResource extends BaseResourceImpl<Course> {
    protected CourseResource(BaseRepoImpl repo) {
        super(new CourseRepo());
    }
}
