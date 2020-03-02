package edu.university.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "SCORES")
@XmlRootElement
public class Score implements BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SCORE_SEQ")
    @Column(name = "SCORE_ID")
    private Integer scoreId;

    @OneToOne
    @JoinColumn(name = "STUDENT_ID")
    private Student student;

    @OneToOne
    @JoinColumn(name = "COURSE_ID")
    private Course course;

    @OneToOne
    @JoinColumn(name = "EXAM_TYPE_ID")
    private ExamType examType;

    @Column(name = "SCORE")
    private double score;

    public Score() {
    }

    public Score(Integer scoreId, Student student, Course course, ExamType examType, double score) {
        this.scoreId = scoreId;
        this.student = student;
        this.course = course;
        this.examType = examType;
        this.score = score;
    }

    public Integer getScoreId() {
        return scoreId;
    }

    public void setScoreId(Integer gradeId) {
        this.scoreId = gradeId;
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
        return "Score{" +
                "scoreId=" + scoreId +
                ", student=" + student +
                ", course=" + course +
                ", examType=" + examType +
                ", grade=" + score +
                '}';
    }
}