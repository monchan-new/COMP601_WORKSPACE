package task6;

public class LeafyGreen extends Vegetable {
  private String type;

  public String getType() {
    return this.type;
  }
  public void setType(String type) {
    this.type = type;
  }

  public LeafyGreen(double weight, double price, String type) {
    super(weight, price);
    this.type = type;
  }

}
