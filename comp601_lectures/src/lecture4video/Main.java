package lecture4video;

import static java.lang.System.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {

    // for(int i = 0; i < 10; i++) {
    //   out.println(i);// 0 - 9
    // }
    // for(int i = 1; i < 10; i++) {
    //   out.println(i);// 1 - 9
    // }
    // for(int i = 1; i <= 10; i++) {
    //   out.println(i);// 1 - 10
    // } 
    // for(int i = 10; i > 0; i--) {
    //   out.println(i);// 10 - 1
    // }

    // Infinite loop example 1
    // for(int i = 0; i < 10; i--) {
    //   out.println(i);// 0, -1, -2, ....
    // }
    // Infinite loop example 2
    // for(int i = 10; i > 0; i++) {
    //   out.println(i);//10, 11, 12, ...
    // }
    // Useless loop example 1
    // for(int i = 0; i > 10; i++) {
    //   out.println(i);//0 > 10 -> false; nothing happen
    // }
    // Useless loop example 1
    // for(int i = 10; i < 0; i--) {
    //   out.println(i);//10 < 0 -> false; nothing happen
    // }

    // for(int i = 1; i <= 9; i++) {
    //   out.printf("i: %d, ", i);
    //   for(int j = 1; j <= 9; j++) {
    //     out.printf("%d ", i * j);
    //   }
    //   out.println();//new line
    // }

    // demoArray();
    // compareForForeach();
    // demoIndexOutofbounds();
    // countIntersection();
    // splitUserInput();
    // demoList();

    List<String> names = new LinkedList<>();
    // names.add("Loy");
    // names.add("Jack");
    // names.add("Marrk");
    // names.add("Sunny");
    // names.add("bill");
    // displaySublist(names);

    String[] strArray = new String[] {"Aa", "Bb", "Cc"};
    // String[] strArray = {"Aa", "Bb", "Cc"};
    String str = "bb";
    out.println(containsIgnoreCase(Arrays.asList(strArray), str));
    out.println(containsIgnoreCase2(strArray, str));
  }

  public static Boolean containsIgnoreCase(List<String> list, String s) {
    return list.stream().anyMatch(e -> e.equalsIgnoreCase(s));
  }

  public static Boolean containsIgnoreCase2(String[] arr, String s) {
    return Arrays.asList(arr).stream().anyMatch(e -> e.equalsIgnoreCase(s));
  }

  public static void displaySublist(List<String> list) {
    //partList = original_list.sublist(<start_index_inclusive>, <end_index_exclusive>)
    List<String> partList = list.subList(1, list.size());
    for(String n : partList) {
      out.print(n + " ");
    }

  }

  public static void demoList() {
    List<String> words = new LinkedList<>();
    words.add("Java");
    words.add("is");
    words.add("fun");
    List<String> words1 = new ArrayList<>(Arrays.asList("java", "is", "fun"));
    out.println(words.size());//3
    for(int i = 0; i < words.size(); i++) {
      out.printf("Index: %d, elment: %s \n", i, words.get(i));
    }
    for(String word : words) {
      out.print(word + " ");
    }
  }
  /*
   * Summary of Array vs. List
   * Array:
   * 1.Fixed capacity once created but faster access
   * 2.length property gives array length
   * 3.use[index] to access arraye lements
   * List:
   * 1. Flexible capacity but slower access
   * 2. size() gives capacity
   * 3. use get(index) to access elements.
   */

  public static void splitUserInput() {
    String line;
    Scanner input = new Scanner(System.in);
    out.print("enter a line of numbers, separated by comma: ");
    line = input.nextLine();
    input.close();

    // Split line into an array of numeric strings
    String[] numAsString = line.split(",");
    // convert numAsString to an array of integers
    int[] nums = new int[numAsString.length];
    for(int i = 0; i < nums.length; i++) {
      // nums[i] = Integer.valueOf(numAsString[i].trim());
      nums[i] = Integer.parseInt(numAsString[i].trim());
    }
    for(int row : nums) {
      for(int column : nums) {
        out.printf("%4d", row * column);
      }
      out.println();
    }
  }

  public static void countIntersection() {
    int[] group1 = {1, 2, 3, 4, 5};
    int[] group2 = {3, 4, 5, 6};

    int count = 0;
    for(int n1 : group1) {
      for(int n2 : group2) {
        out.printf("Comparing %d and %d: ", n1, n2);
        if(n1 == n2) {
          out.print("Match!"); 
          count++;
        }
        out.println();
      }
    }
    out.println("intersection count: " + count);
  }

  public static void demoIndexOutofbounds() {
    int[] nums = {10, 20, 30, 40, 50};
    // int[] nums = new int[5];
    // nums[0] = 10;
    for(int i = 0; i < nums.length; i++) {
    // for(int i = 0; i <= nums.length; i++) {
      out.println(nums[i]);
    }
    for(int n : nums) {
      out.println(n);
    }
  }

  public static void compareForForeach() {
    String[] words = {"java", "is", "fun"};
    for(int i = 1; i < words.length; i++) {
      words[i] = "xxx";// specific elements can be changed
    }
    for(int i = 0; i < words.length; i++) {
      out.println(words[i]);// can change the content of array elements
    }
    
    String[] words1 = {"java", "is", "fun"};
    for(String e : words1) {
      e = "yyy";//need to be changed all elments
    }
    for(String e : words1) {
      out.println(e);//cannot change the content of array elements
    }

  }
  public static void demoArray() {
    String[] words = new String[3];
    words[0] = "Java";
    words[1] = "is";
    words[2] = "fun";

    String[] words1 = {"Java", "is", "fun"};

    out.println(words.length);//3

    for(int i = 0; i < words.length; i ++) {
      out.printf("Index: %d, elment: %s\n", i, words[i]);
    }

    for(String e : words) {
      out.printf("Element: %s \n", e);
    }

  }
}
