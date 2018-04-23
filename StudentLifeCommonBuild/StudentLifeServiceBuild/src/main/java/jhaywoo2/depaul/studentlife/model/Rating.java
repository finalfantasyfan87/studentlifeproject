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
}