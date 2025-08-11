package task9;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import static java.lang.System.*;

public class GameApp {
  private List<Country> countryList;
  public GameApp(String filename) throws IOException {
    countryList = new LinkedList<>();
    readData(filename);
  }
  public void readData(String filename) throws IOException {
    Path path = Paths.get(filename);
    // Path path = new File(filename).toPath();
    List<String> allLines = Files.readAllLines(path);
    
    for(String line : allLines) {
      String[] items = line.split(",");
      try {
        countryList.add(new Country(items[0].trim(), items[1].trim(), Integer.valueOf(items[2].trim())));
      } catch(NumberFormatException e) {
      out.printf("Country: %s, population:[%s]\n", items[0], e);
      break;
      }
    }
  }

  public void game() {
    try(Scanner input = new Scanner(System.in))
    {
      Random rand = new Random();
      while(true) {
        
        int r = rand.nextInt(countryList.size());//[0,5]
        Country selectedCountry = countryList.get(r);
        int count = 0;
        while(count++ < 3) {
          out.printf("What's the capital city of %s?", selectedCountry.getName());
          String answer = input.nextLine();

          if(answer.trim().equalsIgnoreCase(selectedCountry.getCapital())) {
            out.println("Well done!");
            break;
          }else {
            out.printf("Incorrect trial #%d.\n", count);
          }  
        }    
        
        out.printf("It's %s\n", selectedCountry.getCapital());  
        out.printf("%s is a country of %d million.\n", selectedCountry.getName(), selectedCountry.getPopulation());

        out.print("Play again(y/n)?");
        String answer2 = input.nextLine();
        if ( !answer2.trim().equalsIgnoreCase("y")) {
              break;
        }
      }
    }
    
  }

}
