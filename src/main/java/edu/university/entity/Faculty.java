package edu.university.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "FACULTY")
@XmlRootElement
public class Faculty implements BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FACULTY_SEQ")
    @Column(name = "FACULTY_ID")
    private Integer facultyId;

    @Column(name = "FACULTY_NAME", nullable = false)
    private String facultyName;

    @OneToOne
    @JoinColumn(name = "FACULTY_DEAN_ID", nullable = false)
    private Lecturer facultyDean;

    @OneToMany
    @JoinTable(name = "FACULTY_DEPARTMENTS", joinColumns = @JoinColumn(name = "FACULTY_ID"),
            inverseJoinColumns = @JoinColumn(name = "DEPARTMENT_ID"))
    private Collection<Department> departments = new ArrayList<>();

    public Faculty() {
    }

    public Faculty(String facultyName, Lecturer facultyDean, Collection<Department> departments) {
        this.facultyName = facultyName;
        this.facultyDean = facultyDean;
        this.departments = departments;
    }

    public Integer getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(Integer facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public Lecturer getFacultyDean() {
        return facultyDean;
    }

    public void setFacultyDean(Lecturer facultyDean) {
        this.facultyDean = facultyDean;
    }

    public Collection<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Collection<Department> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyId=" + facultyId +
                ", facultyName='" + facultyName + '\'' +
                ", facultyDean=" + facultyDean +
                ", departments=" + departments +
                '}';
    }
}