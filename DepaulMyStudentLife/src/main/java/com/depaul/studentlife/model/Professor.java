package com.depaul.studentlife.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Professor")
@Table(name = "professor")
public class Professor {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long professorId;

  @ManyToOne
  @JoinColumn(name = "departmentId")
  private Department department;

  @OneToMany(mappedBy = "professor", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private List<Course> courseList = new ArrayList<Course>();

  private String name;


  public long getProfessorId() {
    return professorId;
  }

  public void setProfessorId(long professorId) {
    this.professorId = professorId;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Course> getCourseList() {
    //if(courseList)
    return courseList;
  }

  public void setCourseList (List<Course> courseList) {
    this.courseList = courseList;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Professor{");
    sb.append("professorId=").append(professorId);
    sb.append(", department=").append(department);
    sb.append(", courseList=").append(courseList);
    sb.append(", name='").append(name).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
