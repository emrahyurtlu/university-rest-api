package edu.university.repository;

import edu.university.entity.ExamType;

public class ExamTypeRepo extends BaseRepoImpl<ExamType> {
    public ExamTypeRepo() {
        super(ExamType.class);
    }
}
