package jhaywoo2.depaul.studentlife.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "students")
public class Student extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long studentId;

    @NotBlank(message = "Please enter email!")
    @Email(message = "Please enter a valid email")
    private String email;

    @NotBlank(message = "Please enter a 10 character password.")
    private String password;

    @NotBlank(message = "Please enter a username.")
    private String userName;

    @CreatedDate
    private Date createdDate;

//    private Course course;


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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

}
