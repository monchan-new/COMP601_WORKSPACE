package lecture5tutor;
import static java.lang.System.*;
import java.util.*;
public class Main {
  public static void main(String[] args) {
    //Instantiation
    // Cat cat1 = new Cat("grey");
    // out.println(cat1.getColour());

    // cat1.setColour("white");
    // out.println(cat1.getColour());

    // Cat cat2 = new Cat("black");
    // // out.println(cat2.getColour());
    // out.println(cat1.getColour());

    // cat1.meow();
    // cat2.meow();
    // String sound = cat2.getCatSound();
    // out.println(sound);

    // Employee emp = new Employee("E1222", 45000);
    //[instance_name].[instance_method]
    // emp.displayInfo();
    // emp.payRise();
    // emp.displayInfo();

    List<Employee> emps = new LinkedList<>();
    emps.add(new Employee("E001", 56000));
    emps.add(new Employee("E002", 156000));
    emps.add(new Employee("E003", 512000));
    emps.add(new Employee("E004", 96000));

    // List<Employee> emps2 = new LinkedList<>(
    //  Arrays.asList(
    //     new Employee("E001", 56000),
    //     new Employee("E002", 156000),
    //     new Employee("E003", 512000),
    //     new Employee("E004", 96000)
    //  )
    // );

    processEmployees(emps);
    //[class_name].[class_method]
    luckyDraw(emps);
    // Main.luckyDraw(emps);
  }
  //hits helps with Task10
  public static void luckyDraw(List<Employee> list) {
    if(list == null || list.size() == 0) return;
    int c1 = 0, c2 = 0, c3 = 0, r;
    String id;
    Random rand = new Random();
    for(Employee e : list) {
      r = rand.nextInt(11);//[0,10]
      id = e.getEid();
      if(r == 10) {
        c1++;
        out.printf("%s gets 1st prize.\n", id);
      }else if(r >= 7) {
        c2++;
        out.printf("%s gets 2nd prize.\n", id);
      }else {
        c3++;
        out.printf("%s gets 3rd prize.\n", id);
      }
    }
    out.println("1st prize: " + c1);
    out.println("2nd prize: " + c2);
    out.println("3rd prize: " + c3);

  }
  

  //this helps you with this week's task
  public static void processEmployees(List<Employee> list) {
    double total = 0;
    int num = 0;
    //parameter checking
    if(list != null && list.size() > 0) {
      num = list.size();
      for(Employee e : list) {
        e.displayInfo();
        total += e.getSalary();
      }

    }
    out.printf("%-20s%d\n", "Total employees", num);
    out.printf("%-20s%.0f\n", "Total salary", total);


  }
}
