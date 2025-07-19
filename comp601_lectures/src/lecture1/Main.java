package lecture1;
import static java.lang.System.*;
// This is a class name that is wanted to be imported, which includes the field "out".
public class Main {
   /**
    *This is used as the class description, such as 
    * "this is the entry point of Java app, which will be called." 
    *
    * @param args
    * @throws Exception
    */ 

     public static void main(String[] args) throws Exception {
        // This is the entry point of Java app. it needs String array but the name of variable is a convention.

        // This is a single line comment
        /* 
         this is a
         multiple-line
         comment statement.
        */ 
        out.println("---\n----");
        out.println("---\t----");
        out.println("---\"----");
        out.print("Hello");
        out.println("---\\----");
        out.println("---\\n----");
        out.println("----\r===");

        String fmt = "%-15s%-20s\n";
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
        out.println("\" \t Double quote character"); //not good, use a format
        out.println("-------");
        out.println("-".repeat(35));
    }
}
