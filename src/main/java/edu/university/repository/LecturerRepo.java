package edu.university.repository;

import edu.university.entity.Lecturer;

public class LecturerRepo extends BaseRepoImpl<Lecturer> {
    public LecturerRepo() {
        super(Lecturer.class);
    }
}
