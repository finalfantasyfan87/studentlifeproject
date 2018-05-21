//package jhaywoo2.depaul.studentlife.model;
//
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedDate;
//
//import javax.persistence.*;
//import java.sql.Timestamp;
//import java.util.Date;
//
//@Entity
//@Table(name = "ratings")
//public class Rating extends Auditable{
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long ratingId;
//    private long clarity;
//    private long schoolYear;
//    private long easiness;
//    private String comment;
//    @CreatedDate
//    private Date createdDate;
//    @LastModifiedDate
//    private Date updatedDate;
//    private long studentId;
//    private long helpfulness;
//    private String finalGrade;
//    private String subject;
//    private long teacherId;
//
//    public long getRatingId() {
//        return ratingId;
//    }
//
//    public void setRatingId(long ratingId) {
//        this.ratingId = ratingId;
//    }
//
//    public long getClarity() {
//        return clarity;
//    }
//
//    public void setClarity(long clarity) {
//        this.clarity = clarity;
//    }
//
//    public long getSchoolYear() {
//        return schoolYear;
//    }
//
//    public void setSchoolYear(long schoolYear) {
//        this.schoolYear = schoolYear;
//    }
//
//    public long getEasiness() {
//        return easiness;
//    }
//
//    public void setEasiness(long easiness) {
//        this.easiness = easiness;
//    }
//
//    public String getComment() {
//        return comment;
//    }
//
//    public void setComment(String comment) {
//        this.comment = comment;
//    }
//
//    public Date getCreatedDate() {
//        return createdDate;
//    }
//
//    public void setCreatedDate(Date createdDate) {
//        this.createdDate = createdDate;
//    }
//
//    public Date getUpdatedDate() {
//        return updatedDate;
//    }
//
//    public void setUpdatedDate(Date updatedDate) {
//        this.updatedDate = updatedDate;
//    }
//
//    public long getStudentId() {
//        return studentId;
//    }
//
//    public void setStudentId(long studentId) {
//        this.studentId = studentId;
//    }
//
//    public long getHelpfulness() {
//        return helpfulness;
//    }
//
//    public void setHelpfulness(long helpfulness) {
//        this.helpfulness = helpfulness;
//    }
//
//    public String getFinalGrade() {
//        return finalGrade;
//    }
//
//    public void setFinalGrade(String finalGrade) {
//        this.finalGrade = finalGrade;
//    }
//
//    public String getSubject() {
//        return subject;
//    }
//
//    public void setSubject(String subject) {
//        this.subject = subject;
//    }
//
//    public long getTeacherId() {
//        return teacherId;
//    }
//
//    public void setTeacherId(long teacherId) {
//        this.teacherId = teacherId;
//    }
//
//    @Override
//    public String toString() {
//        return "Rating{" +
//                "ratingId=" + ratingId +
//                ", clarity=" + clarity +
//                ", schoolYear=" + schoolYear +
//                ", easiness=" + easiness +
//                ", comment='" + comment + '\'' +
//                ", createdDate=" + createdDate +
//                ", updatedDate=" + updatedDate +
//                ", studentId=" + studentId +
//                ", helpfulness=" + helpfulness +
//                ", finalGrade='" + finalGrade + '\'' +
//                ", subject='" + subject + '\'' +
//                ", teacherId=" + teacherId +
//                '}';
//    }
//}