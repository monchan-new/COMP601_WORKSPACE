package lecture2;

import static java.lang.System.out;
import java.util.Scanner;

public class Main5 {
  
  public static void main(String[] args) {

    calculateTip();

  }
  /*
   * Write a program to ask from the user for a meal price, calculate tip
   * (15% of meal price), then display both the tip and total amount the
   * customer has to pay. Display the results rounding up to two decimal points.
   */
  static void calculateTip()
  {
    final double  TIP_RATE = 0.15;
    double mealPrice;//for storing user input
    try(Scanner input = new Scanner(System.in))
    {
      out.print("Enter a meal price: ");
      mealPrice = input.nextDouble();
    }

    // data processiong
    double tip = mealPrice * TIP_RATE;
    double totalAmount = mealPrice + tip;

    // display the title and line
    String fmt = "%-15s%-15s%-15s\n";
    out.printf(fmt, "Meal price", "Tip", "Total amount");
    String space = String.format("%-35s","");
    String dash = space.replace(" ", "-");
    out.println(dash);

    // display the results
    
    fmt = "%-15s%-15.2f%-15.2f\n";
    // fmt = "%-15s%-15s%-15s\n";
    out.printf(fmt, mealPrice, tip, totalAmount);
  }
}
