package lecture7tutor;
import lecture5tutor.Employee;

public class CEO extends Employee {
  private double profitUp;
  
  //subclass constructor
  public CEO(String eid, double salary, double profitUp) {
    //System.out.println("Hello"); NG
    //subclass constructor must first call suuperclass constructor
    super(eid, salary);
    this.setProfitUp(profitUp);
  }


  @Override public void payRise() {
    double factor = 1 + profitUp;
    setSalary(getSalary() * factor);
  }
  @Override public String getEmployeeType() {
    return "iRule";
  }


  public double getProfitUp() {
    return this.profitUp;
  }
  public void setProfitUp(double profitUp) {
    this.profitUp = profitUp;
  }
}
