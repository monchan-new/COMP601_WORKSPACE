package task10;

public class AudioBook extends Book {
  private double length;

  public AudioBook(String name, int year, double length) {
    super(name, year);
    this.setLength(length);
  }

  public void dispayInfo() {
    System.out.printf("Book name: %s, year: %d, length: %.0d", super.getName(), super.getYear(), this.getName());
  }
  public double getLength() {
    return this.length;
  }
  public void setLength(double length) {
    this.length = length;
  }

}
