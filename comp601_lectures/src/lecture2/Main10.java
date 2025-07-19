package lecture2;

import static java.lang.System.out;
import java.util.Scanner;

public class Main10 {
  
  public static void main(String[] args) {

  out.println(5 / 2);//2, int/int -> int

  out.println(5 / 2.0);//2.5 int/double -> double (because double can have more information than int)
  out.println(5.0 / 2);//2.5 double/int -> double

  out.println(5.0 / 2.0);//2.5 double/double -> double

  out.println(5 / (double)2);//2.5 integer/double -> double
  out.println((double)5 / 2);//2.5 double/integer -> double

  out.println(5 / (int)2.0);//2 integer/integer -> integer
  out.println((int)5.0 / 2.0);//2.5 integer/double -> double
  out.println((int)5.0 / (int)2.0);//2 integer/ineteger -> ineteger
  }
}
