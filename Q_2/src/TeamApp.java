import java.io.IOException;
import java.util.*;

import java.io.*;
import java.nio.file.*;
import static java.lang.System.*;

class TeamApp {
  private List<Team> teams;
  Scanner input = new Scanner(System.in);

  public TeamApp(String filename) throws IOException {

      teams = new LinkedList<Team>();

      readTeamData(filename);

  }

  public void readTeamData(String filename) throws IOException {
    Path path = Paths.get(filename);
    List<String> alllines = Files.readAllLines(path);
    for(String line : alllines) {
      String[] items = line.split(",");
      try{
        teams.add(new Team(items[0].trim(), Integer.valueOf(items[1]), items[2], Double.valueOf(items[3])));
      }catch(NumberFormatException e) {
        out.printf("Team name: %s[%s]", items[0], e);
      }
    }
  }

  public int countTeams() {
    int count = 0;
    for(int i = 0; i < teams.size(); i++) {
      if(teams.get(i).getScore() >= 50 && teams.get(i).getScore() <= 90) {
        count ++;
      }
    }
    return count;
  }

  public void searchTeam() {
    out.printf("Input Team name: ");
      String answer = input.nextLine();
      int count = 0;
      for(Team t : teams) {
        if( answer.trim().equalsIgnoreCase(t.getID())) {
          t.displayInfo();   
          count++;
          break;   
        }  
      }
      if(count == 0)
        out.printf("no result found for team id: %s", answer);

  }

  public double getAverageScore() {
    double total = 0;
    int count = 0;
    for(Team t : teams) {
      if(t.getScore() >= 50) {
        count++;  
      }
      total += t.getScore();
      
    }
    if(count == 0) total = 0;
    return total / teams.size();
  }
}

