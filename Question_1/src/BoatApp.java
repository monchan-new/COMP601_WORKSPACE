import java.util.*;

import task10.AudioBook;

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
            // break;
            return;
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
      Path path = Paths.get(filename);
      List<String> alllines = Files.readAllLines(path);
      for(String line : alllines) {
        String[] items = line.split(",");
        try{
          boats.add(new Boat(items[0].trim(), Double.valueOf(items[1]), Integer.valueOf(items[2])));
        }catch(NumberFormatException e) {
          out.printf("Boat name: %s[%s]", items[0], e);
        }
      }
    }
    public void displayBoatWithMostFuel(){
      // task 10
      if(boats.isEmpty()) return;

      List<Boat> mostFuelBoats = new LinkedList<>();
      Boat firsBoat = boats.get(0);
      mostFuelBoats.add(firsBoat);
      double mostFuel = firsBoat.getFuelLeft();
      for(int i = 1; i < boats.size(); i++) {
        double ifuel = boats.get(i).getFuelLeft();
        if(ifuel > mostFuel) {
          mostFuelBoats.clear();
          mostFuelBoats.add(boats.get(i));
          mostFuel = ifuel;
        }else if( ifuel == mostFuel) {
          mostFuelBoats.add(boats.get(i));
        }
      }
      out.printf("%-30s%-10s%-10s\n", "Plate", "FuelLeft", "Year");
      out.println("-".repeat(50));
      for(Boat b : mostFuelBoats) {
        out.printf("%-30s%-10.1f%-10d\n", b.getPlate(), b.getFuelLeft(), b.getYear());
      }
      out.println("");
    }

    public void searchByPlate() {
      // task 9  
      // use ".trim().equalsIgnoreCase()"
      // or "toLowerCase/toUpperCase"
      out.printf("Input Plate name: ");
      String answer = input.nextLine();
      int count = 0;
      for(Boat b : boats) {
        if( answer.trim().equalsIgnoreCase(b.getPlate())) {
          b.displayInfo();   
          count++;
          break;   
        }  
      }
      if(count == 0)
        out.printf("no boat with %s found.", answer);

    }
    public double getTotalFuelLeft(List<Boat> list, int i) {
		//Recursively calculate total fuel left in all boats.
      // task 8(recursive)
      // if(list != null && list.size()>0) {
      //   List<Boat> sublist = list.subList(1, list.size());
      //           return list.get(0).getFuelLeft() + getTotalFuelLeft(sublist, i);
      // }else {
      //   return 0;
      // }

      //break case
      if(i >= list.size()) return 0;
      //recursive case
      return list.get(i).getFuelLeft() + getTotalFuelLeft(list, i+1);

    }
}
