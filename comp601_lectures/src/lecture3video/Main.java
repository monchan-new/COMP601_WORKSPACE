package lecture3video;

import static java.lang.System.out;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int a = 1;
    if (a == 0);
    // if (a == 0);// do not put a semi=colon at the end of if header
                   // if statement ends.
    {
      out.println("a");
    }
    out.println("b");

    int x = 0;
    if (x > 0)//if statement has 1 block after the condition.
    // so if there're no {}, next statement is regarded as the block and finish the command.
    // {
      out.println(1);
      out.println(2);
    // }
    out.println(3);

    // variableScopeLifetime();
    // demoSwitchStatement();
    // userInputValidation();
    discreteUserInput();

  }

  static void variableScopeLifetime()
  {
    int x = 10;

    if (x == 10)
    {
      // out.print(y);//error, no definition
      out.println(x);//ok
      int y = 20;
      out.println(y);//ok
    }

    // out.println(y);//error
    out.println(x);//ok
  }

  /*
   * Request the name of a season (string), apply switch statement
   * to the season name, and display a correspoinding message about
   * the season.
   */
  static void demoSwitchStatement(){
    String season;
    try(Scanner input = new Scanner(System.in))
    {
      out.print("Enter season name (winter/speing/summer/autumn): ");
      season = input.nextLine();
    }
    switch(season.toLowerCase())
    {
      case "winter":
        out.println("Winter is an etching");
        break;
      case "spring":
        out.println("Spring is ...");
        break;
      case "summer":
        out.println("Summer is ...");
        break;
      case "autumn":
        out.println("Autumn is ...");
        break;
      default:
        out.println("Unkown season name: " + season );
        break;
    }
  }
  

  /*
  * Ask for a score from the user. User input must be 0-100, inclusive.
  * Perform validation on user input. 
  * If the input is invalid the progrm must keep prompting the user for
  * re-entry until a valid input is received.
  */
  static void userInputValidation(){
    double score;
    try(Scanner input = new Scanner(System.in))
    {
      while(true)
      {
        out.print("Enter a score(1-100, inclusive): ");
        score = input.nextDouble();
        if(score >= 0 && score <= 100)
          break;//to stope the while loop
        else
          out.println("Invalid. Try again.");
      }//end of while
    }//end of try
    out.printf("Valid score received: %.1f", score);
  }

  /*
   * The program keeps prompting user for re-entry until one of three colours
   * (red, green, blue) is received. The program then displays personality
   *  trait associated with the user entered colour.
   */
  static void discreteUserInput(){
    String colour;
    try(Scanner input = new Scanner(System.in))
    {
      boolean done = false;
      while(done == false)
      {
        out.print("Choose a colour (red/green/blue): ");
        colour = input.nextLine();
        switch(colour.toLowerCase())
        {
          case "red":
            out.println("You are adventurous, energetic, and rebellious.");
            done = true;
            break;
          case "green":
            out.println("You are calm, peaceful, and serene.");
            done = true;
            break;
          case "blue":
            out.println("You are cllean, joyful, and tranquil.");
            done = true;
            break;
          default:
            out.println("Invalid input. Try again.");
            break;
        }
      }
    }
  }

  
}
