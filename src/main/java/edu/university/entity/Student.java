package edu.university.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "STUDENT")
@XmlRootElement
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "STUDENT_SEQ")
    @Column(name = "STUDENT_ID")
    private Integer studentId;

    @Column(name = "STUDENT_NUMBER")
    private String studentNumber;

    @Column(name = "STUDENT_NAME")
    private String studentName;

    @OneToOne
    @JoinColumn(name = "STUDENT_DEPARTMENT_ID")
    private Department department;

    @OneToMany
    @JoinTable(name = "STUDENT_COURSES", joinColumns = @JoinColumn(name = "STUDENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "COURSE_ID"))
    private Collection<Course> courses = new ArrayList<>();

    @OneToMany
    @JoinTable(name = "STUDENT_SCORES", joinColumns = @JoinColumn(name = "STUDENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "SCORE_ID"))
    private Collection<Score> scores = new ArrayList<>();

    public Student() {
    }

    public Student(String studentNumber, String studentName, Department department, Collection<Course> courses, Collection<Score> scores) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.department = department;
        this.courses = courses;
        this.scores = scores;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Collection<Course> getCourses() {
        return courses;
    }

    public void setCourses(Collection<Course> courses) {
        this.courses = courses;
    }

    public Collection<Score> getScores() {
        return scores;
    }

    public void setScores(Collection<Score> scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentNumber='" + studentNumber + '\'' +
                ", studentName='" + studentName + '\'' +
                ", department=" + department +
                ", courses=" + courses +
                ", scores=" + scores +
                '}';
    }
}