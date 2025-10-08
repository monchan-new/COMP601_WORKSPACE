import java.io.IOException;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args) {

    String filename = "data/boat_data.txt";

    // Watercraft boat = new Boat("aa", 20.5, 6);
    // boat.displayInfo();

    try{
      BoatApp bapp = new BoatApp(filename);
    }catch(IOException ioe){
      out.printf("Please double check the file name: %s, and try again.", filename);
    }

  }
}
