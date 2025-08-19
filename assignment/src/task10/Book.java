package task10;

public class Book {
  private String name;
  private int year;

  
  public Book(String name, int year) {
    this.setName(name);
    this.setYear(year);
  }

  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getYear() {
    return this.year;
  }
  public void setYear(int year) {
    this.year = year;
  }
  
}
