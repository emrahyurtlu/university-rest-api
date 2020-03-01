package edu.university.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "DEPARTMENT")
@XmlRootElement
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEPARTMENT_SEQ")
    @Column(name = "DEPARTMENT_ID")
    private Integer departmentId;

    @Column(name = "DEPARTMENT_NAME", nullable = false)
    private String departmentName;

    @Column(name = "DEPARTMENT_MANAGER_ID")
    @OneToOne(mappedBy = "lecturerId")
    private Lecturer departmentManager;

    @Column(name = "DEPARTMENT_DESCRIPTION")
    private String departmentDescription;

    @OneToMany(mappedBy = "courseId", targetEntity = Course.class, cascade = {CascadeType.ALL})
    @JoinTable(name = "DEPARTMENT_COURSES", joinColumns = @JoinColumn(name = "DEPARTMENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "COURSE_ID"))
    private Collection<Course> departmentCourses;

    public Department() {
        departmentCourses = new ArrayList<>();
    }

    public Department(String departmentName, Lecturer departmentManager, String departmentDescription, List<Course> departmentCourses) {
        this.departmentName = departmentName;
        this.departmentManager = departmentManager;
        this.departmentDescription = departmentDescription;
        this.departmentCourses = departmentCourses;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Lecturer getDepartmentManager() {
        return departmentManager;
    }

    public void setDepartmentManager(Lecturer departmentManager) {
        this.departmentManager = departmentManager;
    }

    public String getDepartmentDescription() {
        return departmentDescription;
    }

    public void setDepartmentDescription(String departmentDescription) {
        this.departmentDescription = departmentDescription;
    }

    public Collection<Course> getDepartmentCourses() {
        return departmentCourses;
    }

    public void setDepartmentCourses(Collection<Course> departmentCourses) {
        this.departmentCourses = departmentCourses;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", departmentManager=" + departmentManager +
                ", departmentDescription='" + departmentDescription + '\'' +
                ", departmentCourses=" + departmentCourses +
                '}';
    }
}