package lecture5video;

public class Car {
  private String location;//private -> capsulate within this class
  private double fuelInTank;//private -> capsulate within this class
  
  public double getFuelInTank() {
    return this.fuelInTank;
  }
  public void setFuelInTank(double fuelInTank) {
    this.fuelInTank = fuelInTank;
  }
  public String getLocation() {
    return this.location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

  public void drive(double km) {
    double fuel = km * 0.2;
    fuelInTank -= fuel;
  }

  public void refill(double amount) {
    fuelInTank += amount;
  }

  public void printCarInfo() {
    System.out.printf("Location: %s, \nFuel in tank: %f \n", this.getLocation(), this.getFuelInTank());
    // System.out.printf("Location: %s, \nFuel in tank: %f \n", getLocation(), getFuelInTank());
    // System.out.printf("Location: %s, \nFuel in tank: %f \n", this.location, this.fuelInTank);
  }

  //no argument constructor 
  //no return value for constructor because it always creates object)
  public Car() {
    location = "warehouse";
    fuelInTank = 0;
  }

  //argument constructor
  public Car(String location, double fuelInTank) {
    this.setLocation(location);
    this.setFuelInTank(fuelInTank);
    // this.location = location;
    // this.fuelInTank = fuelInTank;
  }
}
