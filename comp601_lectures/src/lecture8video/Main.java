package lecture8video;
import static java.lang.System.out;
import java.util.*;
public class Main {
  
  public static void main(String[] args) {
    // int n = 5;
    // countdown(n);
    // out.println(headFactorial(5));
    // out.println(tailFactorial(5, 1));

    // List<Integer> nums = new LinkedList<>();
    // nums.add(10);
    // nums.add(20);
    // nums.add(30);
    // out.println(getListTotal(nums, 0));//60
    // List<Double> floats = new LinkedList<>();
    // floats.add(1.0);
    // floats.add(2.0);
    // floats.add(3.0);
    // out.println(getListProduct(floats, 1));//6.0

    // ObjectRecursion recur = new ObjectRecursion();
    // List<Integer> nums = new LinkedList<>();
    // nums.add(1); nums.add(2); nums.add(3);
    // out.println((recur.getSumIntegers(nums, 0)));

    // List<MyInteger> objList = new LinkedList<>();
    // objList.add(new MyInteger(1));
    // objList.add(new MyInteger(2));
    // objList.add(new MyInteger(3));
    // out.println(recur.getSumObjects(objList, 0));
    // out.println(recur.getTotalCube(objList, 0));

    List<Worker> workers = new LinkedList<>();
    workers.add(new Worker(10, 20));
    workers.add(new Worker(10, 25));
    workers.add(new Worker(20, 18));

    ObjectRecursion recur2 = new ObjectRecursion();
    out.println(recur2.getTotalWage(workers, 0));
  }


  public static double getListProduct(List<Double> list, double product) {
    if(list != null && list.size() > 0) {
      List<Double> sublist = list.subList(1, list.size());
      return getListProduct(sublist, product * list.get(0));
    }else {
      return product;
    }
  }

  /*
   * getListTotal({10, 20, 30}, 0)
   * sublist = {20, 30}
   * getListTotal({20, 30}, 0 + 10)
   * sublist = {30}
   * getListTotal({30}, 0 + 10 + 20)
   * sublist = {}
   * getListTotal({}, 0 + 10 + 20 + 30)
   * return sum(0 + 10 + 20 + 30 = 60)
   */
  public static int getListTotal(List<Integer> list, int sum) {
    if(list != null && list.size() > 0) {
      List<Integer> sublist = list.subList(1, list.size()); //not include end-point
      // out.println(sublist);
      return getListTotal(sublist, sum + list.get(0));
    }else {
      return sum;
    }
  }

  /*
   * Tail factorial
   * 
   * fac(5) = 5 x 4 x 3 x 2 x 1 
   * (recursive) 
   * n=5; call fac(4) + total *= 5 (initial value of total = 1) 
   * n=4; call fac(3) + total *= 4
   * n=3; call fac(2) + total *= 3
   * n=2; call fac(1) + total *= 2
   * n=1; call fac(0) + total *= 1
   * (base) 
   * return total 
   */
  public static int tailFactorial(int n, int fac) {
    if(n > 0) 
    { 
      // int sum = tailFactorial(n - 1, fac * n);
      // out.printf("%d, %d\n", n, sum);
      // return sum;
      return tailFactorial(n - 1, fac * n);
    } else 
    {
      // out.printf("%d, %d\n", n, fac);
      return fac;
    }
  }

  /*
   * fac(5) = 5 x 4 x 3 x 2 x 1 = 5 x fac(4)
   * 
   * fac(n) = when n > 0, n * fac(n-1)
   *          when n == 0, 1
   * 
   * Head factorial
   */
  public static int headFactorial(int n) {
    if(n > 0) // recursive case
    {
      return n * headFactorial(n-1);
    } else // base case
    {
      return 1;
    }
  }

  static void countdown(int n) {
    if(n <= 0) //base case
    { 
      out.println("Blast off!"); 
    } else //recursive case
    {
      out.println(n);
      countdown(n - 1);
      // countdown(n);//Incorrect calling condition
    }
  }
  /*
   * Rules of writeng recursive functions:
   * 1. There must be a base case (the simplest case, stop case, exit case),
   *    where the function itself is NOT called.
   * 2. There must be a recursive case (i.e., calling the function itself),
   *    where the calling parameter must progress towards the base case 
   *    (i.e., making the base condition true)
   */

}


class ObjectRecursion {
  public double getTotalWage(List<Worker> list, double wage) {
    if( list != null && list.size() > 0) {
    // if( !list.isEmpty()) {
      List<Worker> sublist = list.subList(1, list.size());
      return getTotalWage(sublist, wage + list.get(0).getWage());
    }else {
      return wage;
    }
  }

  public int getTotalCube(List<MyInteger> list, int sum) {
     if(list != null && list.size() > 0) {
      List<MyInteger> subList = list.subList(1, list.size());
      return getTotalCube(subList, sum + list.get(0).getCube());
    }else {
      return sum;
    }
  }
  public int getSumObjects(List<MyInteger> list, int sum) {
    if(list != null && list.size() > 0) {
      List<MyInteger> subList = list.subList(1, list.size());
      return getSumObjects(subList, sum + list.get(0).getNumber());
    }else {
      return sum;
    }
  }
  public int getSumIntegers(List<Integer> list, int sum) {
    if(list != null && list.size() > 0) {
      List<Integer> sublist = list.subList(1, list.size());
      return getSumIntegers(sublist,  sum + list.get(0));
    }else {
      return sum;
    }
  }
}

class Worker {
  private double workingHours;
  private double hourRate;

  public Worker(double workingHours, double hourRate) {
    this.workingHours = workingHours;
    this.hourRate = hourRate;
  }

  public double getWage() {
    return workingHours * hourRate;
  }
}

class MyInteger {
  private int number;
  public MyInteger(int number) {
    this.number = number;
  }
  public int getNumber() {
    return number;
  }
  // public void setNumber(int number) {
  //   this.number = number;
  // }
  public int getCube() {
    return number*number*number;
  }

}

