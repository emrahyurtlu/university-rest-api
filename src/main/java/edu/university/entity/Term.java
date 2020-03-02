package edu.university.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "TERM")
@XmlRootElement
public class Term implements BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TERM_SEQ")
    @Column(name = "TERM_ID")
    private Integer termId;

    @Column(name = "TERM_NAME", nullable = false)
    private String termName;

    public Term() {
    }

    public Term(String termName) {
        this.termName = termName;
    }

    public Integer getTermId() {
        return termId;
    }

    public void setTermId(Integer termId) {
        this.termId = termId;
    }

    public String getTermName() {
        return termName;
    }

    public void setTermName(String termName) {
        this.termName = termName;
    }

    @Override
    public String toString() {
        return "Term{" +
                "termId=" + termId +
                ", termName='" + termName + '\'' +
                '}';
    }
}