package jhaywoo2.depaul.studentlife.model;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
@Table(name = "ratings")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ratingId;
    private long clarity;
    private long schoolYear;
    private long easiness;
    private String comment;
    private Timestamp createdDate;
    private Timestamp updatedDate;
    private long studentId;
    private long helpfulness;
    private String finalGrade;
    private String subject;
    private long teacherId;


    public long getRatingId() {
        return ratingId;
    }

    public void setRatingId(long ratingId) {
        this.ratingId = ratingId;
    }


    public long getClarity() {
        return clarity;
    }

    public void setClarity(long clarity) {
        this.clarity = clarity;
    }


    public long getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(long schoolYear) {
        this.schoolYear = schoolYear;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "ratingId=" + ratingId +
                ", clarity=" + clarity +
                ", schoolYear=" + schoolYear +
                ", easiness=" + easiness +
                ", comment='" + comment + '\'' +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", studentId=" + studentId +
                ", helpfulness=" + helpfulness +
                ", finalGrade='" + finalGrade + '\'' +
                ", subject='" + subject + '\'' +
                ", teacherId=" + teacherId +
                '}';
    }
}