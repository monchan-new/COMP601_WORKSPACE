package lecture9tutor;
import java.util.*;
import static java.lang.System.*;
import java.nio.file.*;//Path, Paths, Files
import java.io.*;//Exception
public class BoatApp {
  Scanner input = new Scanner(in);
  List<Boat> boats;
  public List<Boat> getBoats() {//For safety, create only getter(readonly)
    return boats;
  }

  public BoatApp(String filename) throws IOException {
    readData(filename);
  }

  public void searchByPlate() {
    if(boats == null || boats.size() == 0) return;
    out.print("Enter plate: ");
    String plate = input.nextLine();
    Boat boat = null;//flag
    for(Boat b : boats) {
      if(b.getPlate().equalsIgnoreCase(plate)) {
        boat = b;
        break;
      }
    }
    if(boat == null )
      out.println(plate + " doesn't exist");
    else
      boat.displayInfo();
  }

  public List<Boat> getOldestBoat() {
    List<Boat> oldest = new LinkedList<>();
    if(boats != null && boats.size() > 0) {
      int year = boats.get(0).getYear();
      for(Boat b : boats) {
        if(b.getYear() < year) {
          year = b.getYear();
          oldest.clear();
        }
        if(b.getYear() == year) {
          oldest.add(b);
        }
      }
    }
    return oldest;
  }

  public void readData(String filename) throws IOException {
    boats = new LinkedList<>();
    Path path = Paths.get(filename);
    List<String> lines = Files.readAllLines(path);
    for(String line : lines) {
      String[] items = line.split(",");
      String plate = items[0];
      double fuel = Double.parseDouble(items[1]);
      int year = Integer.parseInt(items[2]);
      boats.add(new Boat(plate, fuel, year));
    }
  }
}
