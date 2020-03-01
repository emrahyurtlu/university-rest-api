package edu.university.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "LECTURER")
@XmlRootElement
public class Lecturer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LECTURER_SEQ")
    @Column(name = "LECTURER_ID")
    private Integer lecturerId;

    @Column(name = "LECTURER_NAME", nullable = false)
    private String lecturerName;

    @Column(name = "LECTURER_TITLE", nullable = false)
    private String lecturerTitle;

    @JoinColumn(name = "LECTURER_DEPARTMENT_ID", columnDefinition = "Akademisyenin kadrosunun bulunduğu departman")
    @OneToOne(mappedBy = "DEPARTMENT_ID")
    private Department department;

    @OneToMany
    @JoinTable(name = "LECTURER_DEPARTMENTS", joinColumns = @JoinColumn(name = "LECTURER_ID"), inverseJoinColumns = @JoinColumn(name = "DEPARTMENT_ID"))
    private Collection<Department> lecturerDepartments = new ArrayList<>();

    public Lecturer() {
    }

    public Lecturer(String lecturerName, String lecturerTitle, Department department, Collection<Department> lecturerDepartments) {
        this.lecturerName = lecturerName;
        this.lecturerTitle = lecturerTitle;
        this.department = department;
        this.lecturerDepartments = lecturerDepartments;
    }

    public Integer getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(Integer lecturerId) {
        this.lecturerId = lecturerId;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public String getLecturerTitle() {
        return lecturerTitle;
    }

    public void setLecturerTitle(String lecturerTitle) {
        this.lecturerTitle = lecturerTitle;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Collection<Department> getLecturerDepartments() {
        return lecturerDepartments;
    }

    public void setLecturerDepartments(Collection<Department> lecturerDepartments) {
        this.lecturerDepartments = lecturerDepartments;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "lecturerId=" + lecturerId +
                ", lecturerName='" + lecturerName + '\'' +
                ", lecturerTitle='" + lecturerTitle + '\'' +
                ", department=" + department +
                ", lecturerDepartments=" + lecturerDepartments +
                '}';
    }
}