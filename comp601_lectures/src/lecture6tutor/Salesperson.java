package lecture6tutor;

import lecture5tutor.Employee;

public class Salesperson extends Employee {
  private int salesNumber;

  public Salesperson(String eid, double salary, int salesNumber) {
    super(eid, salary);
    this.setSalesNumber(salesNumber);
  }

  
  public int getSalesNumber() {
    return this.salesNumber;
  }
  public void setSalesNumber(int salesNumber) {
    this.salesNumber = salesNumber;
  }

}
