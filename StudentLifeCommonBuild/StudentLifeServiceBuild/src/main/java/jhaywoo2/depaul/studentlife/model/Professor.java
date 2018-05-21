package jhaywoo2.depaul.studentlife.model;


import javax.persistence.*;

@Entity
@Table(name = "professor")
public class Professor {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long professorId;

  @ManyToOne
  @JoinColumn(name = "departmentId")
  private Department department;

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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Professor{");
        sb.append("professorId=").append(professorId);
        sb.append(", department=").append(department);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
