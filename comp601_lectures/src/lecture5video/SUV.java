package lecture5video;

public class SUV extends Car {// "extends" calls for super class
  private double clearance;// subclass's unique field(s)

  public double getClearance() {
    return this.clearance;
  }

  public void setClearance(double clearance) {
    this.clearance = clearance;
  }

  public SUV(String location, double fuelInTank, double clearance) {
    super(location, fuelInTank);// call for a specified superclass constructor w/ arguments
    this.setClearance(clearance);
  }

}
