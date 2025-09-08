package lecture9tutor;
import static java.lang.System.*;
public class Boat extends Watercraft {
  private double fuel;
  private int year;

  public Boat(String plate, double fuel, int year) {
    super(plate);
    this.setFuel(fuel);
    this.setYear(year);
  }
  public void displayInfo() {
    out.printf("%-20s%s\n", "Plate", super.getPlate());
    out.printf("%-20s%.2f\n", "Fuel", this.getFuel());
    out.printf("%-20s%d\n", "Year", this.getYear());
  }

  public double getFuel() {
    return this.fuel;
  }
  public void setFuel(double fuel) {
    this.fuel = fuel;
  }
  public int getYear() {
    return this.year;
  }
  public void setYear(int year) {
    this.year = year;
  }

}
