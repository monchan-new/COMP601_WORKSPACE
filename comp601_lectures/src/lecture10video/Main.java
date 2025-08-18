package lecture10video;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
  public static void main(String[] args) {
    
    List<Employee> emps = new LinkedList<>();
    //Employee e = new Employee("xx", 10, 10);Can't instantiate abstract class
    Employee e = new Salesperson("S11", 40000, 10);
    emps.add(e);
    e = new CEO("C11", 100000, 100);//re-use the pointer reference varable
    emps.add(e);
    e = new CEO("C22", 120000, 50);
    emps.add(e);
    e = new Salesperson("S22", 45000, 15);
    emps.add(e);
    // List<Employee> emps = new ArrayList<>(Arrays.asList(
    //   new Salesperson("S11", 40000, 10),
    //   new CEO("C11", 100000, 100),
    //   new CEO("C22", 120000, 50),
    //   new Salesperson("S22", 45000, 15)
    // ));
    for(Employee emp : emps) {
      emp.displayInfo();
      emp.raiseSalary();
    } 
    
      System.out.println();
    for(Employee emp : emps) {
      emp.displayInfo();
    }
  }
}

//abstract class
abstract class Employee {
  protected String EID;
  protected double salary;

  public Employee(String eid, double salary) {
    this.setEid(eid);
    this.setSalary(salary);
  }

  public void displayInfo() {
    System.out.printf("Employee ID: %s, Employee salary: %f\n", this.getEid(), this.getSalary());
  }  

  //abstract method
  public abstract void raiseSalary();

  
  public String getEid() {
    return this.EID;
  }
  public void setEid(String eid) {
    this.EID = eid;
  }
  public double getSalary() {
    return this.salary;
  }
  public void setSalary(double salary) {
    this.salary = salary;
  }

}

class Salesperson extends Employee {
  private int salesNumber;

  public Salesperson(String id, double salary, int salesNumber) {
    super(id, salary);
    this.setSalesNumber(salesNumber);
  }

  @Override public void raiseSalary() {
    double payRiseFactor = 0;
    if(salesNumber > 50) {
      payRiseFactor = 20;
    } else {
      payRiseFactor = 10;
    }
    double rise = salary * payRiseFactor / 100;
    salary += rise;
    
  }

  
  public int getSalesNumber() {
    return this.salesNumber;
  }
  public void setSalesNumber(int salesNumber) {
    this.salesNumber = salesNumber;
  }

}

class CEO extends Employee {
  private int stockOptions;

  public CEO(String id, double sal, int stockOptions) {
    super(id, sal);
    this.stockOptions = stockOptions;
  }

  @Override public void raiseSalary() {
    salary += 20000;
    stockOptions += ThreadLocalRandom.current().nextDouble(1,100);
  }
  @Override public void displayInfo() {
    System.out.printf("Employee ID: %s, Employee salary: %f, Employee stockoptions: %d\n", this.getEid(), this.getSalary(), this.getStockOptions());
  }  

  public int getStockOptions() {
    return this.stockOptions;
  }
  public void setStockOptions(int stockOptions) {
    this.stockOptions = stockOptions;
  }

}