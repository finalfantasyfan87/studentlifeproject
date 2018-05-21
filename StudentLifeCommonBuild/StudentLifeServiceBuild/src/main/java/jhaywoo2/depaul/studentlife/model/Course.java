package jhaywoo2.depaul.studentlife.model;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long courseId;

    @
    private long departmentId;
    private long number;
    private String title;
    private String credits;


    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }


    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }


    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Course{");
        sb.append("courseId=").append(courseId);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", number=").append(number);
        sb.append(", title='").append(title).append('\'');
        sb.append(", credits='").append(credits).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
