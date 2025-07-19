package task2;

import static java.lang.System.out;
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {

    radiusToPerimeter_Area();

  }

  /*
   * This program asks from the user for radius, calculates 
   * the input to perimeter & area, then displays the results.
   */
  static void radiusToPerimeter_Area()
  {
    // "final" keyword prevents the variable from being modified
    final double PAI = Math.PI;
    double radius;//for storing user input
    try(Scanner input = new Scanner(System.in))
    {
      out.print("Enter circle radius: ");
      radius = input.nextDouble();
    }

    // data processiong
    double perimeter = radius * 2 * PAI;
    double area = Math.pow(radius, 2) * PAI;

    // display the title and line
    String fmt = "%-15s%-15s%-15s\n";
    out.printf(fmt, "Radius", "Perimeter", "Area");
    String space = String.format("%-35s","");
    String dash = space.replace(" ", "-");
    out.println(dash);

    // display the results
    
    fmt = "%-15s%-15.2f%-15.2f\n";
    // fmt = "%-15s%-15s%-15s\n";
    out.printf(fmt, radius, perimeter, area);
  }
  
}
