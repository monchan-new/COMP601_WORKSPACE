package task3;

import static java.lang.System.*;//System.in & System.out
import java.util.*;//Scanner

public class Main {
  
  public static void main(String[] args){

    // Validate user input
    double userScore = userInputValidation();

    // Display user grade
    displayUserGrade(userScore);

  }

  
  static boolean isDouble(String str) {
    if(str == null) return false;
    try{
      Double.parseDouble(str);
    }catch (NumberFormatException nfe){
      System.out.println("Not a number: " + nfe.getMessage());
      return false;
    }
    return true;
  }
  
  static double userInputValidation(){
    double score;
    try(Scanner input = new Scanner(System.in))
    {
      while(true)
      {
        out.print("Enter a score(1-100, inclusive): ");
        String str = input.nextLine();
        
        //validate type of input
        if(!isDouble(str)) continue;//if false, skip the following steps
        
        //Display grade based on score
        score = Double.parseDouble(str);
        if(score >= 0 && score <= 100)
          break;//to stop the while loop
        else
          out.println("Invalid range. Try again.");
      }//end of while
    }//end of try
    return score;
  }

  static void displayUserGrade(double score){
    String grade;
    if(score >=80) 
      grade = "A";
    else if(score >=70)
      grade = "B";
    else if(score >=50)
      grade = "C";
    else
      grade = "D";
    
    out.printf("Score %.1f will receive grade %s", score, grade);
  }

}
