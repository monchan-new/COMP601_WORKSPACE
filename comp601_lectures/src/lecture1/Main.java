package lecture1;
import static java.lang.System.*;
// System is start with capital letter.
public class Main {
   /**
    * this is the entry point of Java app, which will be called 
    * (some applicaton will use this as the class description.)
    * @param args
    * @throws Exception
    */ 

     public static void main(String[] args) throws Exception {
        // This is a sinle line comment
        /* 
         this is a
         multiple-line
         comment statement.
        */ 
        out.println("---\n----");
        out.println("---\t----");
        out.println("---'----");
        out.print("Hello");
        out.println("---\'----");

        String fmt = "%-15s%-20s";
        out.printf(fmt, "first", "out of gate");
        out.printf(fmt, "third", "time lucky");

        nonValueReturn(); //this is how we call void methods
        // Main.nonValueReturn(); //this is strict expression

        valueReturn(); // bad usage
        String msg = valueReturn();
        out.println(msg);

        int num = add(2,3);
        out.println("Result: " + num);

        tasks();

    }
    // void means no return
    public static void nonValueReturn() {
        out.println("I'm a non-value-return methond");
    }
    // w/o "static" can't use in class method but in instance method

    public static String valueReturn() {
        return "I'm a value-return methond";
    }

    public static int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    // 20 colums,  how to define "/n",
    public static void tasks() {
        out.println("\" kjkjkj");
        out.println("\" \t Double quote character"); //not good :-
        out.println("-------");
        out.println("-".repeat(35));
    }
}
