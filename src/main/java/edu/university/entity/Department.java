package edu.university.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collection;

@Entity
@Table(name = "DEPARTMENT")
@XmlRootElement
public class Department implements BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEPARTMENT_SEQ")
    @Column(name = "DEPARTMENT_ID")
    private Integer departmentId;

    @Column(name = "DEPARTMENT_NAME", nullable = false)
    private String departmentName;

    @OneToOne
    @JoinColumn(name = "DEPARTMENT_MANAGER_ID")
    private Lecturer departmentManager;

    @Column(name = "DEPARTMENT_DESCRIPTION")
    private String departmentDescription;

    @OneToMany
    @JoinTable(name = "DEPARTMENT_COURSES", joinColumns = @JoinColumn(name = "DEPARTMENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "COURSE_ID"))
    private Collection<Course> departmentCourses;

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