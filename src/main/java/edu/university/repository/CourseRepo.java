package edu.university.repository;

import edu.university.entity.Course;

public class CourseRepo extends BaseRepoImpl<Course> {
    public CourseRepo() {
        super(Course.class);
    }
}
