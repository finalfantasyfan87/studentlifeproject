package jhaywoo2.depaul.studentlife.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long studentId;

    //@NotBlank(message = "{email.NotBlank")
    private String email;


    //@NotBlank(message = "{password.NotBlank")
    private String password;

    private String userName;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
