package jhaywoo2.depaul.studentlife.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity(name = "students")
public class Student {
    @Id
    @Column(name = "studentId")
    private long studentId;
    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "createdDate")
    private Timestamp createdDate;

    @Column(name = "updatedTime")
    private Timestamp updatedTime;


    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Timestamp getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Timestamp updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", createdDate=" + createdDate +
                ", updatedTime=" + updatedTime +
                '}';
    }
}
