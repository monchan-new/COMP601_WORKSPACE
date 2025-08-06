package lecture9video;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
public class StudentApp {
  private List<Student> students;
  public StudentApp(String fn) throws IOException {
    students = new LinkedList<>();
    readStudenData(fn);
  }
  public void readStudenData(String filename) throws IOException {
    Path path = new File(filename).toPath();
    List<String> content = Files.readAllLines(path);
    for(String line : content) {
      String[] items = line.split(",");
      Student s = new Student(items[0], items[1], Double.valueOf(items[2]));
      students.add(s);
    }
  }

}
