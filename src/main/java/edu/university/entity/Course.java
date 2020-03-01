package edu.university.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "COURSE")
@XmlRootElement
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COURSE_SEQ")
    @Column(name = "COURSE_ID")
    private Integer courseId;

    @Column(name = "COURSE_NAME", nullable = false)
    private String courseName;

    @Column(name = "COURSE_CODE", nullable = false)
    private String courseCode;

    @OneToOne(mappedBy = "departmentId")
    @JoinColumn(name = "COURSE_DEPARTMENT_ID")
    private Department courseDepartment;

    public Course() {
    }

    public Course(String courseName, String courseCode, Department courseDepartment) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseDepartment = courseDepartment;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Department getCourseDepartment() {
        return courseDepartment;
    }

    public void setCourseDepartment(Department courseDepartment) {
        this.courseDepartment = courseDepartment;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseCode='" + courseCode + '\'' +
                ", courseDepartment=" + courseDepartment +
                '}';
    }
}