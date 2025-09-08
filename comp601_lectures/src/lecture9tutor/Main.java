package lecture9tutor;
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    String datafile = "boat_data.txt"; 
    try{
      BoatApp app = new BoatApp(datafile);
      List<Boat> fleet = app.getBoats();
      showFleet(fleet);
      showFleet(app.getOldestBoat());
      app.searchByPlate();
      out.println(getTotalFuel(fleet));
    }catch(IOException e) {
      out.println(datafile + " doesn't exist");
    }
  }
  public static double getTotalFuel(List<Boat> list) {
    //base case
    if(list == null || list.size() == 0)
     return 0;
    //recursive case
    double fuel = list.get(0).getFuel();
    List<Boat> sub = list.subList(1, list.size());
    return fuel + getTotalFuel(sub);
  }

  public static void showFleet(List<Boat> list) {
    if(list != null && list.size() > 0) {
      out.printf("%-20s%-20s%-20s\n", "Plate", "Fuel", "Year");
      for(Boat b : list) {
        out.printf("%-20s%-20s%-20s\n", b.getPlate(), b.getFuel(), b.getYear());
      }
    }
  }

}
