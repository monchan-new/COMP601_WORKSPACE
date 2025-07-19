package lecture2;

import static java.lang.System.out;
import java.util.Scanner;

public class Main3 {

  public static void main(String[] args) {

    arithmeticTable();

  }
  /*
   * this program first asks fromt the user for two numbers (as double).
   * It calculates the addition, subtraction, multiplication, and division
   * of the two numbers, adn displays the results as a table.
   */
  static void arithmeticTable()
  {
    double op1, op2;
    try(Scanner input = new Scanner(System.in))
    {
      out.print("Enter first number: ");
      op1 = input.nextDouble();
      out.print("Enter second number (non-zero):");
      op2 = input.nextDouble();
    }
    //Calculate the results
    double add = op1 + op2;
    double sub = op1 - op2;
    double mul = op1 * op2;
    double div = op1 / op2;

    // Display the results as a table

    // Display table header
    String h1 = "Operand_1", h2 = "Operation";
    String h3 = "Operand_2", h4 = "Results";
    String fmt = "%-20s%-20s%-20s%-20s\n";
    out.printf(fmt, h1, h2, h3, h4);

    // Table dash line
    String spaceLine = String.format("%80s", ""); // create string of blank*80 + null (cf. printf(fmt, ""))
    String dashLine = spaceLine.replace(" ", "-");
    // String dashLine = "-".repeat(80);
    out.println(dashLine);

    // Rows of results
    out.printf(fmt, op1, "+", op2, add);
    out.printf(fmt, op1, "-", op2, sub);
    out.printf(fmt, op1, "*", op2, mul);
    out.printf(fmt, op1, "/", op2, div);
  }
}
