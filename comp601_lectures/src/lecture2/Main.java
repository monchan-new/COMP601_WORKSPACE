package lecture2;
import static java.lang.System.out;
import java.util.Scanner;
public class Main {

    // try with resources statement
    public static void main(String[] args) {
        
        try(Scanner input = new Scanner(System.in)) 
        {
            // Read string input
            out.print("Enter your name: ");
            String name = input.nextLine();
            out.printf("How are you, %s?\n", name);

            // Read Integer input
            out.print("Enter an intger: ");
            int num = input.nextInt();
            out.printf("Entered number is: %d.\n", num);

            // Read float input
            out.printf("enter a float number: ");
            double d = input.nextDouble(); //45.789
            out.printf("Round up to 2 points: %-10.2f\n", d);
            out.printf("Round up to 4 points: %-15.4f\n", d);
        //     out.printf("Round up to 2 points: %.2f\n", d);
        //     out.printf("Round up to 4 points: %.4f\n", d);
        }

    }
}
