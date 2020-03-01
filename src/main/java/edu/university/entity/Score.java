package edu.university.entity;

import javax.persistence.*;

@Entity
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SCORE_ID")
    private Integer gradeId;

    @JoinColumn(name = "STUDENT_ID")
    @OneToOne
    private Student student;

    @JoinColumn(name = "COURSE_ID")
    @OneToOne
    private Course course;

    @JoinColumn(name = "EXAM_TYPE_ID")
    @OneToOne
    private ExamType examType;

    @Column(name = "SCORE")
    private double score;

    public Score() {
    }

    public Score(Integer gradeId, Student student, Course course, ExamType examType, double grade) {
        this.gradeId = gradeId;
        this.student = student;
        this.course = course;
        this.examType = examType;
        this.score = grade;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ExamType getExamType() {
        return examType;
    }

    public void setExamType(ExamType examType) {
        this.examType = examType;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gradeId=" + gradeId +
                ", student=" + student +
                ", course=" + course +
                ", examType=" + examType +
                ", grade=" + score +
                '}';
    }
}