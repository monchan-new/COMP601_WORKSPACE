package lecture2video;

import static java.lang.System.out;
import java.util.Scanner;

public class Main7 {
  
  public static void main(String[] args) {

    int c = 0;

    c++;//increment: increase by 1. Same as c = c + 1;
    out.println(c);//1
    c--; //decrement: decrease by 1. Same as c = c - 1;
    out.println(c);//0

    ++c;//increment: increase by 1. Same as c = c + 1;
    out.println(c);//1
    --c;//decrement: decrease by 1. Same as c = c - 1:
    out.println(c);//0

    //c++ and c--: postfix
    //++c and --c: prefix

    out.println("--------------");
    c = 0;
    int result = c++; //result = c; c = c + 1;
    out.println(result);//0 (not 1)
    out.println(c);//1
    
    out.println("--------------");
    c = 0;
    result = ++c; //c = c + 1; result = c; 
    out.println(result);//1 (not 0)
    out.println(c);//1


  }


}
