import static java.lang.System.*;

public class Watercraft {
  private String plate;

  public Watercraft(String plate) {
    this.plate = plate;
    // setPlate(plate);
  }

  // parent class method is also needed
  public void displayInfo() {
    out.printf("Watercraft Info: plate= %s", this.getPlate());
  }

  public String getPlate() {
    return this.plate;
  }

  public void setPlate(String plate) {
    this.plate = plate;
  }
}
