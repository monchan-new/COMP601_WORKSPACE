package lecture2video;

import static java.lang.System.out;
import java.util.Scanner;

public class Main9 {
  
  public static void main(String[] args) {

  int n = 2;
  double d = 1.5;

  //int -> double: implicit conversion
  d = n;//2.0
  out.println(d);

  //double -> int: explicit conversion (because there's a loss of information.)
  // n = d;//error
  n = (int)d;//2
  out.println(n);

  }
}
