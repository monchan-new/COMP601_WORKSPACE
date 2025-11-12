import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {        

      try{

            TeamApp app = new TeamApp("team_data.txt");

            app.searchTeam();
            out.println("Number of teams: " + app.countTeams());
            out.println("Average score: " + app.getAverageScore());
        }catch(IOException ioe) {

           ioe.printStackTrace();

        }




    //   List<Ticket> tickets = new LinkedList<>();

    //   tickets.add(new Ticket("A111", 1240.50));

    //   tickets.add(new Ticket("A222", 155.8));

    //   tickets.add(new Ticket("A333", 245.50));

    //   System.out.printf("Total points: %d", getTotalPoints(tickets));

    // }

    // public static int getTotalPoints(List<Ticket> list) {

    //   //Note, this needs to be a recursive method

    //   // lecture 8(tutor)

    //   // break case
    //   if(list == null || list.size() == 0)
    //     return 0;
    //   // recursive case
    //   List<Ticket> subList = list.subList(1, list.size());
    //   return list.get(0).getPoints() + getTotalPoints(subList);

    }

}
