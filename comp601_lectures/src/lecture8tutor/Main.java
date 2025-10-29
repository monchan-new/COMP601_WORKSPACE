package lecture8tutor;
import static java.lang.System.*;
import java.util.*;
import java.util.concurrent.TimeUnit;// pause in console

public class Main {
  public static void main(String[] args) {

    int n = 4;
    out.printf("Factorial of %d is %d\n", n, factorial(n));
    n = 10;
    out.printf("Factorial of %d is %d\n", n, factorial(n));

    n = 5;
    launch(n);

    List<Integer> nums = new LinkedList<>();
    nums.add(4); nums.add(5); nums.add(6);
    out.println(sum(nums));
    int total = 0;
    out.println(sum2(total, nums));
    out.println(sum3(nums, 0));

    List<Ticket> tickets = new LinkedList<>();
    tickets.add(new Ticket("A111", 1245));
    tickets.add(new Ticket("A222", 145));
    tickets.add(new Ticket("A333", 245));
    tickets.add(new Ticket("A444", 2245.65));
    out.println(getTotalPoints(tickets));
    //use fixed-sized 'Arrays.asList' to set initial values
    List<Ticket> tickets2 = Arrays.asList(
    new Ticket("A111", 1245),
    new Ticket("A222", 145),
    new Ticket("A333", 245),
    new Ticket("A444", 2245.65)); 
    out.println(getTotalPoints2(tickets2, 0));
    // use non-fixed size 'ArrayList' to set inititial values
    List<Ticket> tickets3 = new ArrayList<>(Arrays.asList(
    new Ticket("A111", 1245),
    new Ticket("A222", 145),
    new Ticket("A333", 245),
    new Ticket("A444", 2245.65))); 
     out.println(getTotalPoints2(tickets3, 0));

    int total3 = 8, start = 1;  
    toaster(total3, start);
    int restBread = 8, currentBread = 1;  
    toaster(restBread, currentBread);

  }
  
  public static void toaster(int n, int c) {
    //base case
    if(n <= 0) {
      out.println("Done");
      return;
    }
    //recursive case
    out.printf("Toasting piece %d. \n", c);//msg
    //pause
    try {
      // TimeUnit.SECONDS.sleep(1); 
      Thread.sleep(300); 
    }catch(Exception e) {}
    toaster(n-1, c+1);
  }

  public static int getTotalPoints2(List<Ticket> list, int index) {
    //break case
    if(index >= list.size()) return 0;
    //recursive case
    return list.get(index).getAirPoints() + getTotalPoints2(list, index + 1);
    // return list.get(index).getAirPoints2 + getTotalPoints2(list, index + 1);
    //can't use fields to create other property because fields execute before constructor, hence alywas equals 0.
  }
  public static int getTotalPoints(List<Ticket> list) {
    //break case
    if(list == null || list.size() == 0) return 0;
    //recursive case
    List<Ticket> sub = list.subList(1, list.size());
    int firstPoints = list.get(0).getAirPoints();
    return firstPoints + getTotalPoints(sub);
  }

  public static int sum3(List<Integer> list, int index) {
      if (index >= list.size()) return 0;
      return list.get(index) + sum3(list, index + 1);
  }

  public static int sum2(int total, List<Integer> list) {
  //break case
  if(list == null || list.size() == 0) return total;
  //recursive case
  List<Integer> sub = list.subList(1, list.size());
  total += list.get(0);
  return sum2(total, sub);
  }

  public static int sum(List<Integer> list) {
    //break case
    if(list == null || list.size() == 0) return 0;
    //recursive case
    List<Integer> sub = list.subList(1, list.size());
    return list.get(0) + sum(sub);
  }

  public static void launch(int n) {
    //base case
    if(n == 0) out.println("Blast!");
    //recursive case: break off piece + make call + do each stage action
    else {
      out.println(n);
      launch(n-1);
    }
  }

  public static int factorial(int n) {
    //base case
    if(n <= 1) return 1;
    //recursive case: break off piece + make call + combine results (return)
    return n * factorial(n-1);
  }

}
