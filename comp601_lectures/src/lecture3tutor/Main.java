/*
 * Topics today:
 * 1. Variable scope
 * 2. Compare strings vs numbers: equals VS ==
 * 3. validating user input
 * 4. Random number generation
 * 5. Game: twentyOne()
 * 5. Method repearTwetyOne()
 */
package lecture3tutor;

import static java.lang.System.*;
import java.util.*;

public class Main {
  static Scanner input = new Scanner(System.in);

  private static final Random rand = new Random();

  public static void main(String[] args) {

    // compareStrings();
    // readInputWithLoop();
    // int low = 1;
    // int up = 100;
    // out.println(getRandomNumber(low, up));
    // twentyOne();
    repeatTwentyOne();

  }

  public static void repeatTwentyOne() {
    while(true) {
      out.println("\n\n==New Game==\n\n");
      twentyOne();
      out.print("Play again (y/n)");
      if(input.nextLine().equalsIgnoreCase("n")) {
        out.println("Bye");
        return;
      }
    }
  }

  public static void twentyOne() {
    // Arcade console version of black jack
    int dealer = getRandomNumber(15, 21);//dealer's hand
    // int dealer = getNumber(1, 21);//dealer's hand
    int player = 0;
    int card = 0;
    String resp;
    boolean bust = false;//flag

    // Game process
    while(true) {
      out.printf("Your hand is %d. Want a car (y/n): ", player); 
      resp = input.nextLine();
      if(resp.equalsIgnoreCase("y")) {
        card = getRandomNumber(1, 13);
        out.println("Card: " + card);
        if(player + card <= 21) {
          player += card;//add card to player's hand
        }else {
          bust = true;//busted
          break;//game over
        }
      }else if(resp.equalsIgnoreCase("n")) {
        break;//player chooses to stop
      }else {
        out.println("Invalid response");
      }
    }//end of game process

    out.println("====");
    if(bust) {
      out.printf("You're busted: %d + %d > 21\n", player, card);
      out.println("Dealer's hand: " + dealer);
    }else {
      String fmt = "%-15s%d\n";
      out.printf(fmt, "Dealer:", dealer);
      out.printf(fmt, "Player:", player);
      if(player > dealer) {
        out.println("You won");
      }else if(player < dealer) {
        out.println("You lost");
      }else {
        out.println("Draw");
      }
    }//end of reporting
  }

  public static int getRandomNumber(int low, int up) {
    // return new Random().ints(low,up+1).findFirst().getAsInt();
    return rand.nextInt(up - low + 1) + low;
  }
     

  public static void readInputWithLoop() {
    int size;
    while(true) {
      out.print("How many grades to process: ");
      size = input.nextInt();
      if(size > 0) {
        break;
      }else {
        out.println("Invalid");
      }
    }
    double total = 0.0;
    int counter = 1;
    while(counter <= size) {
      out.printf("Enter grade #%d: ", counter);
      total += input.nextDouble();
      counter++;
    }
    out.println("Class size: " + size);
    out.printf("Total grade: %.1f\n", total);
  }
  

  public static void compareStrings() {
    out.println(5 == 5);//comparing integer with "==" is okay
    out.println("Enter a string");
    String val = input.nextLine();//"hello"
    out.println(val == "hello");//false because "==" comparing addresses
    out.println(val.equals("hello"));
    out.println(val.equalsIgnoreCase("HELLO"));

    // compare numbers
    out.println("Enter a number");
    int num = input.nextInt();//123
    out.println(num == 123);//true (int is primitive, not object; so "==" means value comparison)
  }

  public static void variableScope() {
    // Scope: defined by a (closed) pair of curly braces
    // In scope: accessible 
    // Out of scope: inaccessible
    int num1 = 10;
    if(num1 == 10) {
      int num2 = 20;
    }//variable num2 ceases to exist after this line
    // out.println(num2);// num2 doesn't exit here
  }

}
