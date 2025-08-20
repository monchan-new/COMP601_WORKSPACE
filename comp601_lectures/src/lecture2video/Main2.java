package lecture2video;

import static java.lang.System.out;
import java.util.*;

public class Main2 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    m1();
    m2();
    
    input.close();
  }

  public static void m1() {
    out.print("In m1, enter a number: ");
    int num = Integer.parseInt(input.nextLine());//Safer way to change to int
    out.println(num);
  }

  public static void m2() {
    out.print("In m2, enter a number: ");
    int num = Integer.parseInt(input.nextLine());
    out.println(num);
  }
}
