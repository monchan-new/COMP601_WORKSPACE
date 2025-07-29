package task6;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<LeafyGreen> veges = new LinkedList<>();
    veges.add(new LeafyGreen(10, 3.5, "Cabbage"));
    veges.add(new LeafyGreen(5, 2.94, "Lettuce"));
    veges.add(new LeafyGreen(20, 5.45, "Broccoli"));
    veges.add(new LeafyGreen(7, 1.94, "Lettuce"));
    veges.add(new LeafyGreen(15, 2.8, "Lettuce"));
    veges.add(new LeafyGreen(30, 2.5, "Cabbage"));
    veges.add(new LeafyGreen(28, 4.4, "Broccoli"));
    veges.add(new LeafyGreen(20, 5.5, "Cabbage"));
    veges.add(new LeafyGreen(16, 3.9, "Broccoli"));
    veges.add(new LeafyGreen(26, 4.8, "Broccoli"));
    
    calculateStatus(veges);

  }

  public static void calculateStatus(List<LeafyGreen> veges) {
    double totalCost = 0;
    double cabbageWeight = 0;
    double broccoliWeight = 0;
    double lettuceWeight = 0;
    double othersWeight = 0;
    for(LeafyGreen v : veges) {
      double weight = v.getWeight();
      double cost = weight * v.getPrice();
      totalCost += cost;
      switch(v.getType()) {
        case "Cabbage": cabbageWeight += weight; break;
        case "Broccoli": broccoliWeight += weight; break;
        case "Lettuce": lettuceWeight += weight; break;
        default: othersWeight += weight; break;
      }

      // String msg = switch(v.getType()) {
      //   case "Cabbage" -> { cabbageWeight += weight; yield "Cabbage weight = " + cabbageWeight;
      //   }
      //   case "Broccoli" -> { broccoliWeight += weight; yield "Broccoli weight = " + broccoliWeight;
      //   }
      //   case "Lettuce" -> { lettuceWeight += weight; yield "Lettuce weight = " + lettuceWeight;
      //   }
      //   default -> { othersWeight += weight; yield "Others weight = " + othersWeight;
      //   }
      // };//needs semicolon!
      // System.out.println(msg);
    }
      System.out.println("Sample run output");
      System.out.printf("Total vegetable cost: $%.1f\n", totalCost);
      System.out.printf("Total Cabbage weight: %.1f kg\n", cabbageWeight);
      System.out.printf("Total Broccoli weight: %.1f kg\n", broccoliWeight);
      System.out.printf("Total Lettuce weight: %.1f kg\n", lettuceWeight);
      // System.out.printf("Total Others weight: %.1f kg\n", othersWeight);

  }
}
