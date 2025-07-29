package task6;

public class Vegetable {
  private double weight;
  private double price;


  public double getWeight() {
    return this.weight;
  }
  public void setWeight(double weight) {
    this.weight = weight;
  }
  public double getPrice() {
    return this.price;
  }
  public void setPrice(double price) {
    this.price = price;
  }

  public Vegetable(double weight, double price) {
    this.weight = weight;
    this.price = price;
  }


}
