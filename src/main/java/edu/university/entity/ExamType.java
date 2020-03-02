package edu.university.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "EXAM_TYPE")
@XmlRootElement
public class ExamType implements BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EXAM_TYPE_SEQ")
    @Column(name = "EXAM_TYPE_ID")
    private Integer examTypeId;

    @Column(name = "EXAM_TYPE_NAME", nullable = false)
    private String examName;

    public ExamType() {
    }

    public ExamType(String examName) {
        this.examName = examName;
    }

    public Integer getExamTypeId() {
        return examTypeId;
    }

    public void setExamTypeId(Integer examTypeId) {
        this.examTypeId = examTypeId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    @Override
    public String toString() {
        return "ExamType{" +
                "examTypeId=" + examTypeId +
                ", examName='" + examName + '\'' +
                '}';
    }
}