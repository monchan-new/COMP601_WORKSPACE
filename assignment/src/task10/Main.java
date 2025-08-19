package task10;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args) {
    String txtfile = "datafolder/bookdata.txt";
    try{
      AudioBookApp app = new AudioBookApp(txtfile);
      out.println("Shortest books:\n");
      displayBooks(app.getShortestBooks());
      out.printf("Books published btw 2010-2020: %d\n", app.countBooks());
      app.randomBookList();
    }catch(IOException ioe) {
      out.printf("Perhaps missing text file: %s/%s? \n\n", 
      new Main().getClass().getPackage().getName(), txtfile);
    }
  }
  public static void displayBooks(List<AudioBook> list) {
    out.printf("%-30s%-10s%-10s\n", "Title", "Year", "Lengt");
    out.println("-".repeat(50));
    for(AudioBook b : list) {
      out.printf("%-30s%-10d%-10.1f\n", b.getName(), b.getYear(), b.getLength());
    }
    out.println("");
  }
  
}
