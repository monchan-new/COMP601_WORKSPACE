package lecture9video;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    // System.out.prinln("Hello," + name);// compile error
    // demo();

    // FileIOBasics fileio = new FileIOBasics();
    String fname = "datafolder/sample_data.txt";
    List<String> content = new LinkedList<>();
    content.add("John, 20");
    content.add("Alan, 30");
    content.add("Bill, 40");
    // content.add("Jack,50");

    // System.out.println(System.getProperty("user.dir"));
    try {
    FileIOBasics.writeFile(fname, content);
    // fileio.writeFile(fname, content);

    FileIOBasics.readFile(fname);
    } catch(IOException ioe) {
      System.out.println("Exception caught: " + ioe.toString());
    }

    System.out.println("\n\n Application code carry on ...");
  }

  static void demo() {
    int[] nums = new int[3];
    nums[0] = 10;
    nums[1] = 20;
    nums[2] = 30;

    //this loop could cause "index out of bounds" unchecked exception
    for(int i = 0; i < nums.length; i++) {
    // for(int i = 0; i <= nums.length; i++) 
      System.out.println(nums[i]);
    }
    System.out.println("\n\n code after loop carry on ...");
  }
}

class FileIOBasics {
  public static void readFile(String filename) throws IOException {
    // Path path = new File(filename).toPath();
    Path path = Paths.get(filename);
    List<String> content = Files.readAllLines(path);
    for(String line : content) {
      String[] items = line.split(",");
      String name = items[0].trim();
      try {
        int age = Integer.valueOf(items[1].trim());
        System.out.printf("Name: %s, age: %d\n", name, age);
      } catch(NumberFormatException e) {
        System.out.printf("Name: %s, age: [%s]\n", name, e);
        break;
      }
    }
  }
  public static void writeFile(String filename, List<String> data) throws IOException {
  // public void writeFile(String filename, List<String> data) throws IOException {

    // Path path = new File(filename).toPath();
    Path path = Paths.get(filename); // modern way
    Files.write(path, data);
  }
}

