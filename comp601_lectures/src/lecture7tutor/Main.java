package lecture7tutor;
import java.util.LinkedList;
import java.util.List;
import lecture5tutor.*;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args) {

    // PostIt it = new PostIt(200,300,"blue");
    // out.println(it.getColour()+it.getLength()+it.getWidth());

    // demo subtype polymorphism
    List<Employee> emps  = new LinkedList<>();
    var sp = new Salesperson("s11", 40000, 10);
    emps.add(sp);
    var ceo = new CEO("c11", 100000, 0.15);
    emps.add(ceo);
    Employee e = new Salesperson("s22", 50000, 51);
    emps.add(e);

    demoDynamicBinding(emps);

    var emp= getMaxEmp(emps);
    if(emp != null )
    
      out.println("=".repeat(20));
      emp.displayInfo();
  }

  public static Employee getMaxEmp(List<Employee> list) {
    if(list == null || list.size() == 0) return null;
    Employee maxEmp = list.get(0);
    for(Employee e : list) {
      if(maxEmp.getSalary() < e.getSalary())
        maxEmp = e;
    }
    return maxEmp;
  }



  public static void demoDynamicBinding(List<Employee> list) {
    if(list == null || list.size() == 0) return;
    displayAll(list);
    for(Employee e : list) {
      out.println(e.getEmployeeType());// dynamic binding
      e.payRise();// dynamic binding
    }
      out.println("=".repeat(20));
      displayAll(list);
  }

  public static void displayAll(List<Employee> list) {
    if(list != null && list.size()>0) {
      for(Employee e : list)
        e.displayInfo();
    }
  }

}
