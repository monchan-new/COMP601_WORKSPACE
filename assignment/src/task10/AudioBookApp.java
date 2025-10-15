package task10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static java.lang.System.*;

public class AudioBookApp {

  private List<AudioBook> bookList;
  public AudioBookApp(String filename) throws IOException {
    bookList = new LinkedList<>();
    readData(filename);
  }

  public void readData(String filename) throws IOException {
    Path path = Paths.get(filename);
    List<String> allLines = Files.readAllLines(path);
    for(String line : allLines) {
      String[] items = line.split(",");
      try{
        bookList.add(new AudioBook(items[0].trim(), Integer.valueOf(items[1]), Double.valueOf(items[2])));
      }catch(NumberFormatException e) {
        out.printf("Book name: %s[%s]", items[0], e);
      }
    }
  }
  public List<AudioBook> getBookList() {
    return bookList;
  }
  public List<AudioBook> getShortestBooks() {
    if (bookList.isEmpty()) return new LinkedList<>();

    List<AudioBook> shortestBooks = new LinkedList<>();
    AudioBook firstBook = bookList.get(0);
    shortestBooks.add(firstBook);
    double minLength = firstBook.getLength();
    for(int i = 1; i < bookList.size(); i++) {
      double ilen = bookList.get(i).getLength();
      if( ilen < minLength ) {
        shortestBooks.clear();
        shortestBooks.add(bookList.get(i));
        minLength = ilen;
      }else if( ilen == minLength) {
        shortestBooks.add(bookList.get(i));
      }
    } 
    return shortestBooks;
  }
  
  public int countBooks() {
    int count = 0;
    for(AudioBook ab : bookList) {
      if(ab.getYear() >= 2010 && ab.getYear() <= 2020) {
        count ++;
      }
    }
    return count;
  }
  public void randomBookList() {
    List<List<AudioBook>> b = new LinkedList<>();//can't use array of List -> use List of List
    for(int i = 0; i < 3; i++) {//Initialize inner List
      b.add(new LinkedList<AudioBook>());
    }
    Random rand = new Random();
    int[] count = new int[3];
    for(AudioBook ab : bookList) {
      int r = rand.nextInt(3);//[0-2]
      b.get(r).add(ab);
      count[r]++;
    }
    
    out.println("");
    for(int i = 0; i < 3; i++) {
      out.printf("%d books in list #%d\n", count[i], i+1);
      for(AudioBook ab : b.get(i)) {
        out.printf("%s %d %.1f\n", ab.getName(), ab.getYear(), ab.getLength());
      }
      out.println("");
    }
  }
}
