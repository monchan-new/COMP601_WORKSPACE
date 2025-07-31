package lecture5video;

public class MPV extends Car {
  private int seats;

  public int getSeats() {
    return this.seats;
  }
  public void setSeats(int seats) {
    this.seats = seats;
  }

  public MPV(String location, double fuelInTank, int seats) {
    super(location, fuelInTank);
    this.setSeats(seats);
  }

  @Override public void printCarInfo() {
    super.printCarInfo();
    System.out.printf("Seats: %d \n", this.getSeats());
  }

}
