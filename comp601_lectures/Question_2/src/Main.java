import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {        

              List<Ticket> tickets = new LinkedList<>();

              tickets.add(new Ticket("A111", 1240.50));

              tickets.add(new Ticket("A222", 155.8));

              tickets.add(new Ticket("A333", 245.50));

              System.out.printf("Total points: %d", getTotalPoints(tickets));

    }

    public static int getTotalPoints(List<Ticket> list) {

              //Note, this needs to be a recursive method
      // break case
      if(list == null || list.size() == 0)
        return 0;
      // recursive case
      List<Ticket> subList = list.subList(1, list.size());
      int firstPoints = list.get(0).getPoints();
      return firstPoints + getTotalPoints(subList);

    }

}
