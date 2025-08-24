package lecture7tutor;

import lecture5tutor.Employee;

public class Salesperson extends Employee {
  private int salesNumber;

  public Salesperson(String eid, double salary, int salesNumber) {
    super(eid, salary);
    this.setSalesNumber(salesNumber);
  }

  
  @Override public void payRise() {
    double factor = (salesNumber > 50)? 0.2 : 0.1;
    double newSal = getSalary() * (1 + factor);
    setSalary(newSal);
  }
  @Override public String getEmployeeType() {
    return "iSell";
  }

  
  public int getSalesNumber() {
    return this.salesNumber;
  }
  public void setSalesNumber(int salesNumber) {
    this.salesNumber = salesNumber;
  }

}
