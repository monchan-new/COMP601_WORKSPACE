import static java.lang.System.*;
public class Boat extends Watercraft {
  private double fuelLeft;
  private int year;

  public Boat(String plate, double fuelLeft, int year) {
    super(plate);
    this.fuelLeft = fuelLeft;
    this.year = year;
  }

  public void displayInfo() {
    out.printf("Boat Info: plate= %s, fuelLeft= %.2f, year= %d", super.getPlate(), this.getFuelLeft(), this.getYear());
  }
  public double getFuelLeft() {
    return this.fuelLeft;
  }

  public void setFuelLeft(double fuelLeft) {
    this.fuelLeft = fuelLeft;
  }

  public int getYear() {
    return this.year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  
}
