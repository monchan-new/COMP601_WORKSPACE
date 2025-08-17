package lecture5tutor;

public class Employee {
  private String eid;
  private double salary;

  public Employee(String eid, double salary) {
    this.setEid(eid);
    this.setSalary(salary);
  }

  public void displayInfo() {
    System.out.printf("ID: %s, salary: %.0f\n", eid, salary);
  }  
  public void payRise() {
    this.setSalary(salary+1000);
  }

  
  public String getEid() {
    return this.eid;
  }
  public void setEid(String eid) {
    this.eid = eid;
  }
  public double getSalary() {
    return this.salary;
  }
  public void setSalary(double salary) {
    this.salary = salary;
  }

}
