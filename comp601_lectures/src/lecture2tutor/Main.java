package lecture2tutor;
/*
 * 1. Using pritf() on numbers
 * 2. Local vs class variables
 * 3. Definite assignment policy
 * 4. Implict vs explicit casting
 * 5. Read user input as string/int/double
 * 5. Validating double values
 * 6. Selection statements
 */
import static java.lang.System.*;//System.in & System.out
import java.util.*;//Scanner

public class Main{
  
  static int something; //class variable -> given initial value automatically(=0)

  // Create Scanner instance as class variable (shared by multiple methods)
  static Scanner input = new Scanner(in);


  public static void main(String [] args) {
    printFormat();
    // definitAssignment();
    // implicitExplicit();
    // readString();
    // readInteger();
    // readDouble();

    // boolean ans = isDouble("5.0");
    // boolean ans = isDouble("5");
    // boolean ans = isDouble("");
    // boolean ans = isDouble("a");
    // boolean ans = isDouble(null);
    // out.printf("True or false: %b", ans);

    // ifSelect();
    // switchSelect();
    // switchExpression();

  }
  
  // To assing a value to a variable based on the condition
  public static void switchExpression(){
    out.print("Enter a number: ");
    int n = input.nextInt();
    String msg = switch(n){
      // case 1 -> {
      //   yield "First out of gate";
      // }
      case 1 -> "First out of gate";//if no block (= one line), no "yield" necessary  (cf. same as "return" in a function)
      case 2 -> {
        yield "Second gate";
      }// no need ";" after each case coz each case is element of switch expression
      case 3, 4, 5, 6 -> {
        yield "three, four, five, six";
      }
      default -> {
        yield "The rest";
      }
    };
    out.println((msg));
  }

  // To do an action based on the condition
  public static void switchSelect(){
    out.printf("Enter a number: ");
    int n = input.nextInt();
    switch(n){
      case 1: out.println("First out of gate"); break;
      case 2: out.println("Second out of gate"); break;
      case 3, 4, 5, 6: out.println("3 to 6 out of gate"); break;
      default: out.println("The rest"); break;
    }
  }

  public static void ifSelect() {
    out.print("Enter a score: ");
    double score = input.nextDouble();
    out.print("Plagiarism? (1-yes, 0-no): ");
    int plagiarism = input.nextInt();
    if(score >= 0 && score < 50 || plagiarism == 1){
      out.println("Fail");
    }else{
      out.println("Pass");
    }

  }

  public static boolean isDouble(String str) {
    if(str == null) return false;
    try{
      double d = Double.parseDouble(str);
    }catch (NumberFormatException nfe){
      System.err.println("Parse error: " + nfe.getMessage());
      return false;
    }
    return true;
  }

  public static void readDouble() {
    out.print("Enter a double: ");
    double d = input.nextDouble();
    double cube = Math.pow(d, 3);
    out.printf("Rounded: %.1f\n", cube);
    /* input.nextInt vs Ineger.parseInt(input.nextLine())
     * the latter is safer
     * when the former read "5\n", take only "5" but leave \n, 
     * then, if next command is nextLine, the command read "/n" (if nextInt/nextDouble ignores "\n")
     */
  }

  public static void readString() {
    out.print("Enter your name:");
    String name = input.nextLine();
    out.printf("Welcome to comp601, %s\n", name);
  }

  public static void readInteger() {
    out.print("Enter and integer: ");
    int num = input.nextInt();
    int square = num * num;
    out.printf("Sauare: %d\n", square);
  }

  public static void implicitExplicit() {
    //type compliance
    int num = 5;
    String str = "some";
    double d = 2.5;

    double d1 = 3;//implicit casting: 3 -> 3.0
    // int num1 = 3.6;//error
    int num1 = (int)3.6;//explict casting: 3.6 -> 3 *only cut off! (no round)

    String str1 = "5";
    // String word = "2cents";

    int num2 = Integer.parseInt(str1);//"5" -> 5
    String str2 = "2";
    int num3 = Integer.parseInt(str2);//"2" -> 2
    out.println(num2/num3);//inger/integer -> integer: 2

    //Integer.parseInt("2.5");//NumberFormatException (coz it causes data loss)
    //Double.parseDouble("2.5");//Okay

    String str3 = "3";
    double num4 = Double.parseDouble(str3);//"3" -> 3 -> 3.0

    out.println(num4/num3);// 3.0/2 => 1.5, double/integer -> double

    /*
     * Integer.PaseInt vs Integer.ValueOf
     * Double.PaseDouble vs Double.ValueOf
     * -> primitive vs object
     * primitive: 3 == 3; true
     * object: object1 == object2; false(address of object is different even if it includes the same property)
     */

     Integer num5 = Integer.valueOf("128");
    //  Integer num5 = Integer.valueOf("127");
    //  Integer num6 = Integer.valueOf("128");
    //  Integer num6 = Integer.valueOf("127");
     int num6 = Integer.valueOf("128");
     out.println(num5 == num6 ? "equal" : "not equal");

  }

  public static void definitAssignment() {
    //Local variables: variables defined in a method
    //Class variables: variables defined in a class but outside methods
    int num;//uninitialized variable
    // out.println(num);//not be intialized -> error
    num = 10;
    out.println(num);//okay
    out.println(something);//automatically intialized -> okay
    

  }
  public static void printFormat() {
  //%[alignmnet][min-width][type]
    String fmt = "%10s%-15s\n";
    out.printf(fmt, "Hello", "java");
    out.printf(fmt, "HelloHelloHello", "java");
    String output = String.format(fmt,"Hello", "java" );
    out.println(output); 

    int num1 = 7879;
    out.printf("%d\n", num1);// d for int
    out.printf("%05d\n", num1);// 5 digit "0" padding

    //%[alignmnet][min-width][.precision][type]
    double num2 = 2.36;
    out.printf("Showing two numbers:%-10d%-10.1f\n", num1, num2);
    // out.printf("Showing two numbers:%-10d%-10.1f\n", num2, num1); //wrong types
  }
}
