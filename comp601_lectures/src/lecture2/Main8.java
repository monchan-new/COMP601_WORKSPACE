package lecture2;

import static java.lang.System.out;
// import java.util.Scanner;

public class Main8 {

  public static void main(String[] args) {

    String str1 = "2";
    // int result = str1 + 10;//error
    int num1 = Integer.parseInt(str1);// "2"->2
    int result = num1 + 10;
    out.println(result);// 12

    String str2 = "1.5";
    double num2 = Double.parseDouble(str2);// "1.5"->1.5
    double total = num2 * 2;
    out.println(total);// 3.0

    // int n = Integer.parseInt(str2);//NumberFormatException
    int n1 = (int) Double.parseDouble(str2);// "1.5"->1.5->1
    int n2 = (int) Math.round(Double.parseDouble(str2));// "1.5"->1.5->2.0->2
    out.println(n1 + "," + n2);// "1, 2"

  }
}
