package task8;

import static java.lang.System.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<Bag> bags = new LinkedList<>();
    bags.add(new Bag("white", 10));
    bags.add(new Bag("blue", 15));
    bags.add(new Bag("red", 20));
    bags.add(new Bag("purple", 25));
    bags.add(new Bag("black", 30));

    BagApp bgapp = new BagApp();
    double totalCapacity = bgapp.calcTotalCapacity(bags);
    out.printf("Total capacity: %.2f\n", totalCapacity);
    out.printf("Total number of bags: %d\n", bags.size());
  }
}

class BagApp {
  public double calcTotalCapacity(List<Bag> baglist) {
    if(baglist != null && baglist.size()>0) {
      List<Bag> sublist = baglist.subList(1, baglist.size());
      return baglist.get(0).getCapacity() + calcTotalCapacity(sublist);
    }else {
      return 0;
    }
  }
}

class Bag {
  private String colour;
  private double capacity;
  public String getColour() {
    return this.colour;
  }
  public void setColour(String colour) {
    this.colour = colour;
  }
  public double getCapacity() {
    return this.capacity;
  }
  public void setCapacity(double capacity) {
    this.capacity = capacity;
  }
  
  public Bag(String colour, double capacity) {
    this.colour = colour;
    this.capacity = capacity;
  }

}