package edu.university.resource;

import edu.university.entity.ExamType;
import edu.university.repository.BaseRepoImpl;
import edu.university.repository.ExamTypeRepo;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("exam-types")
@Produces(MediaType.APPLICATION_JSON)
public class ExamTypeResource extends BaseResourceImpl<ExamType> {
    protected ExamTypeResource(BaseRepoImpl repo) {
        super(new ExamTypeRepo());
    }
}
