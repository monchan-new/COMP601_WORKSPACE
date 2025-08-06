package lecture9video;

public class Student extends Person {
  
  public Student(String name, String ID, double grade) {
    super(name);
    this.ID = ID;
    this.grade = grade;
  }

  private String ID;
  private double grade;
  public String getID() {
    return this.ID;
  }
  public void setID(String ID) {
    this.ID = ID;
  }
  public double getGrade() {
    return this.grade;
  }
  public void setGrade(double grade) {
    this.grade = grade;
  }


}
