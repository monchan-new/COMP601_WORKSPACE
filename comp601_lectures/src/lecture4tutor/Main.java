
/*
 * Topics
 * 1. Array concepts
 * 2. For loops
 * 3. List concepts
 * 4. List processing
 */
package lecture4tutor;

import static java.lang.System.*;
import java.util.*;

public class Main {
  static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {

    //Declare an array
    double[] darr = new double[3];
    darr[0] = 10;
    darr[1] = 20;
    darr[2] = 30;
    // darr[4] = 40;//error: index out of bounds
    // double[] darr = new double[] {10,20,30};//Initialize + assign values
    out.println(darr[1]);//20: 
    out.println(Arrays.toString(darr));

    out.print("Enter array size: ");// ex. 3
    int size = input.nextInt();
    double[] darr1 = new double[size];
    //For-index loop
    for(int i = 0; i < darr1.length; ++i) {//"++i" & "i++"" have the same effect
      darr1[i] = i * 5;
      out.printf("%d, %.1f\n", i, darr1[i]);
    }
    //For-each loop
    for(double e : darr1) {
      out.println(e);
      // out.println(darr1[e]);//error: e is not index
      e = 100;//this has no effect! (won't change the original array)
    }
    /*
     * for-index 
     * pros: read and write!!, partial iteration, forward and backward.
     * cons: slower, prone to errors(complex syntax).
     * for-each 
     * pros: faster!!, simpler syntax
     * cons: read-only, not partial iteration, forward only
     */

    String[] strarr1 = new String[] {"Java", "is", "fun"};//not explicitly specify the size
    for(String e : strarr1) {
      out.println(e);
    }
    String[] strarr2 = new String[] {"Fun", "is", "codinng"};
    //nested for-each loops
    int count = 0;
    for(String e1 : strarr1) {
      for(String e2 : strarr2) {
        if(e1.equalsIgnoreCase(e2))//count same string ignoring case
        count++;
      }
    }
    out.println("same word count: " + count);//2

    //Create empty list of Integer
    List<Integer> intList = new LinkedList<>();//only create start location
    // List<int>//error: list contains only object
    // = new ArrayList();//both are okay
    intList.add(10);//allocate empty space; create pointer from start point
    intList.add(20);//allocate any empty sapce; create pointer from 1st elemtn
    intList.add(30);
    out.println(intList.get(0));//10
    out.println(intList.get(1));//20
    out.println(intList.get(2));//30
    // out.println(intList.get(3));//error:
    out.println(intList.size());//3

    //convert array to list
    String str = "5,10,15,20,25";
    String[] strs = str.split(",");
    List<Integer> numList = new LinkedList<>();
    //List<Integer> numList; //numList is null!!
    //numList = new LinkedList<>();//numList is no longer null but size() = 0!!
    for(String e : strs) {
      numList.add(Integer.parseInt(e));//"5" -> 5
    }
    //Check list membership: "indexOf" and "contains"
    out.println(numList.indexOf(15));//index of element = 2
    out.println(numList.indexOf(3));//not in the list = -1!
    if(numList.contains(2) == false) {
      out.println("2 is not in the list");
    }
    int biggest = getMax(numList);
    out.println("List max is " + biggest);

    String[] arr = "Milk,Bread,Aplle,Butter,Cheese".split(",");
    // String[] arr2 = new String[]{"Milk","Bread","Aplle","Butter","Cheese"};// this is more simple
    // String[] arr3 = {"Milk","Bread","Aplle","Butter","Cheese"};// this is also possible
    List<String> items = Arrays.asList(arr);//can also use for other object types as "Intger" & "Double"; But list size will be fixed!!
    // List<String> items2 = new ArrayList<>(Arrays.asList(arr));//can create variable size list
    queryList(items);
  }

  public static void queryList(List<String> list) {
    if(list == null || list.size() == 0) {
      out.println("Nothing to query");
      return;
    }
    int num = 0;
    while(true) {
      out.printf("Enter number (1-%d): ", list.size());
      num = input.nextInt();
      if(num >= 1 && num <= list.size())
        break;
      else
        out.println("Invalid");
    }
    String item = list.get(num-1);
    out.printf("Item #%d: %s", num, item);
  }

  public static int getMax(List<Integer> list) {
    if(list == null || list.size() == 0)
      return 0;//use 0 to indicate empty list
    int maxNum = list.get(0);//use first element as candidate
    for(int e : list) {
      if(e > maxNum)
        maxNum = e;
    }
    return maxNum;
  }

}
