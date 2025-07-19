package task1;
import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        
        // print escape sequences description
        describeEscape();
    }

    public static void describeEscape() {
        // defnition of format
        String form = "%-20s%-25s\n";

        // print title & each escape sequences
        out.printf(form, "Escape sequence", "Description");
        out.println("-".repeat(45));
        out.printf(form, "\\n",  "New line character");
        out.printf(form, "\\t",  "Horizontal tab character");
        out.printf(form, "\\\"", "Double quote character");
        out.printf(form, "\\b",  "Backspace character");
        out.print("\n");
    }

}
