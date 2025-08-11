package lecture5tutor;
import static java.lang.System.*;
public class Cat {
  private String colour;

  //Constructor
  public Cat(String colour) {
  //1. Exactly same name as class, 2. No return type
  // pulic + class name + (fields); argument "colour" can be named differently but it's conventional to use the same name
  // no type definition(ex. int) or "return" necessary coz when it called by "new", it automatically returns created object('s address)
    this.setColour(colour);
  }
  //Instance method - not static
  public void meow() {
    out.printf("A %s cat says meow...\n", colour);
  }
  public String getCatSound() {
    return String.format("A %s cat says meow...", colour);
  }

  public String getColour() {
    return this.colour;
  }
  public void setColour(String colour) {
    this.colour = colour;
  }


}
