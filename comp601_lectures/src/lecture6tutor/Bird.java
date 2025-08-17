package lecture6tutor;

public class Bird extends Pet {
  private String colour;

  public Bird(String name, String colour) {
    super(name);
    this.setColour(colour);
  }

  public void fly() {
    System.out.printf("A %s bird named %s is flying high...\n", colour, super.getName());
  }

  public String getColour() {
    return this.colour;
  }
  public void setColour(String colour) {
    this.colour = colour;
  }

  
}
