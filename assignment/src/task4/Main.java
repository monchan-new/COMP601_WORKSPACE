package task4;

import static java.lang.System.*;
import java.util.*;

public class Main {
  
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {

    // Input two strings & Split them into arrays
    String nth;
    // 1st line
    nth = "First";
    String[] str1 = splitUserInput(nth);
    int numOfInput1 = str1.length;
    // 2nd line
    nth = "Second";
    String[] str2 = splitUserInput(nth);
    int numOfInput2 = str2.length;

    // Put duplicate names into List
    List<String> commonColor = new ArrayList<>();
    commonColor = listIntersection(str1, str2);

    // Print overlapping colors' number & names
    printOverlappingColor(numOfInput1, numOfInput2, commonColor);

    input.close();
  }

  public static void printOverlappingColor(int num1, int num2, List<String> commonColor) {
    out.println();
    out.printf("You entered %d colours in first list\n", num1);
    out.printf("You entered %d colours in second list\n", num2);
    out.printf("Number of overlapping colours: %d\n", commonColor.size());
    out.println("Overlapping colours are as follows:");
    for(String e : commonColor) {
      out.println(e);
    }
  }

  public static List<String> listIntersection(String[] str1, String[] str2) {
    List<String> commonStrings = new ArrayList<>();
    for(String e1 : str1) {
      for(String e2 : str2) {
        if(e1.equals(e2)) {
          commonStrings.add(e1);
          break;
        }
      }
      // if(containsIgnoreCase(Arrays.asList(str2), e1)) {
      //     commonStrings.add(e1);
      //   }
    }
    return commonStrings;
  }

  // public static Boolean containsIgnoreCase(List<String> list, String s) {
  //   return list.stream().anyMatch(e -> e.equalsIgnoreCase(s));
  // }

  public static String[] splitUserInput(String title) {
    String line;
    out.printf("Enter %s line of colours: ", title);
    line = input.nextLine();

    // Split string into an array of strings
    String[] str = line.split(",");
    return str;
  }

}
