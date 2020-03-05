package edu.university.repository;

import edu.university.entity.Department;

public class DepartmentRepo extends BaseRepoImpl<Department> {
    public DepartmentRepo() {
        super(Department.class);
    }
}
