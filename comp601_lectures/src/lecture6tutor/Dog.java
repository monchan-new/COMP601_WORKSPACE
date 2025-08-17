package lecture6tutor;

public class Dog extends Pet {
  private double weight;

  public Dog(String name, double weight) {
    super(name);
    this.setWeight(weight);
  }

  public String getBarkSound(){
    return "Woof";
  }

  public double getWeight() {
    return this.weight;
  }
  public void setWeight(double weight) {
    this.weight = weight;
  }

}
