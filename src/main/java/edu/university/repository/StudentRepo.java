package edu.university.repository;

import edu.university.entity.Student;

public class StudentRepo extends BaseRepoImpl<Student> {
    public StudentRepo() {
        super(Student.class);
    }
}
