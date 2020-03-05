package edu.university.repository;

import edu.university.entity.Faculty;

public class FacultyRepo extends BaseRepoImpl<Faculty> {
    public FacultyRepo() {
        super(Faculty.class);
    }
}
