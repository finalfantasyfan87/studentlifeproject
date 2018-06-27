package com.depaul.studentlife.model;

import javax.persistence.*;

@Entity(name = "Course")
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long courseId;

    @ManyToOne
    @JoinColumn(name ="departmentId")
    private Department department;

    @ManyToOne()
    @JoinColumn(name = "professorId")
    private Professor professor;


    private long courseNo;
    private String title;
    private String credits;


    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }


    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public long getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(long courseNo) {
        this.courseNo = courseNo;
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

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Course{");
        sb.append("courseId=").append(courseId);
        sb.append(", department=").append(department);
        sb.append(", professor=").append(professor);
        sb.append(", courseNo=").append(courseNo);
        sb.append(", title='").append(title).append('\'');
        sb.append(", credits='").append(credits).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
