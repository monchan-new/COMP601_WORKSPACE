package lecture2video;

import static java.lang.System.out;
import java.util.Scanner;

public class Main4 {
  
  public static void main(String[] args) {

    poundToKilo();

  }

  /*
   * This program asks from the user for weight in pound, converts 
   * the input to kilo, then displays the result in various precisions. 
   */
  static void poundToKilo()
  {
    // "final" keyword prevents the variable from being modified
    final double KILO_PER_POUND = 0.4536;
    // cf. pound per kilo = 2.20462
    double weightInPound;//for storing user input
    try(Scanner input = new Scanner(System.in))
    {
      out.print("Enter weight in pound: ");
      weightInPound = input.nextDouble();
    }
    // data processiong
    double kilo = weightInPound * KILO_PER_POUND;
    // Display the result in difference precisions
    out.printf("Default roundup: %f\n", kilo);
    out.printf("Roundup to 2 points: %-10.2f\n", kilo);
    out.printf("Roundup to 3 points: %-10.3f\n", kilo);
  }
  
}
