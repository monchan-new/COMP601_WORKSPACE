package lecture6tutor;

import static java.lang.System.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    // Salesperson sp = new Salesperson("s11", 40000, 10);
    // // call inherited methods from Employee
    // sp.displayInfo();
    // sp.payRise();
    // out.println(sp.getSalary());

    // CEO ceo = new CEO("c11", 100000, 0.25);
    // ceo.displayInfo();
    // ceo.payRise();
    // out.println(ceo.getSalary());

    Bird bd = new Bird("Birty", "yellow");
    Dog dg = new Dog("Daisy", 5.5);
    bd.fly();
    out.printf("%s says %s, I'm %.0f kg\n", dg.getName(), dg.getBarkSound(), dg.getWeight());

    List<Dog> dogs = new LinkedList<>();
    dogs.add(dg);
    dogs.add(new Dog("Spot", 7));
    dogs.add(new Dog("Fido", 3.1));
    calcDogs(dogs);

  }

  public static void calcDogs(List<Dog> list) {
    if (list != null && list.size() > 0) {
      double total = 0;
      for (Dog d : list) {
        total += d.getWeight();

      }
      out.printf("Total weight: %.2f\n", total);
      out.printf("Average weight: %.2f\n", total / list.size());
    }
  }
}
