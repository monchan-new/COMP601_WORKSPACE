import java.util.*;
import java.io.*;
import java.nio.file.*;
import static java.lang.System.*;

public class BoatApp {
    Scanner input = new Scanner(System.in);
    List<Boat> boats = new LinkedList<>();

    public BoatApp(String filename) throws IOException { 
        readData(filename);
        displayMenu();
		int opt = 0;
		String str = null;
		while (true) {
			out.print("\nSelect an option: ");
			str = input.nextLine().trim();
			if(str.isEmpty()) continue;
			if(str.chars().allMatch(Character::isDigit) == false) {
				out.println("Please enter a number.");
				continue;
			}
			opt = Integer.parseInt(str);
			if (opt < 1 || opt > 4) {
				out.println("Invalid option.");
				continue;
			}
			switch (opt){
				case 1: 
					searchByPlate(); 
					break;
				case 2: 
					displayBoatWithMostFuel(); 
					break;
				case 3: 
					out.printf("Total fuel: %.2f", getTotalFuelLeft(boats, 0));
					break;
				case 4: 
					out.println("Bye");
					break;
			}			
		}//end of while
    }
    public void displayMenu(){
        out.println("\n\n*************************************");
        out.println("* Menu                              *");
        out.println("*************************************\n");
        out.println("1. Search boat by plate");
        out.println("2. Display boat with most fuel in tank");
        out.println("3. Display total fuel left in all boats");
        out.println("4. Exit");
    }

    public void readData(String filename) throws IOException {
      // task 10/9
    }
    public void displayBoatWithMostFuel(){
      // task 10
    }
    public void searchByPlate() {
      // task 9 + taks 10 (Main) 
      // use ".trim().equalsIgnoreCase()"
      // or "toLowerCase/toUpperCase"
    }
    public double getTotalFuelLeft(List<Boat> list, int i) {
		//Recursively calculate total fuel left in all boats.
    
      // task 8(recursive)
      double x = 0;
      return x;
    }
}
