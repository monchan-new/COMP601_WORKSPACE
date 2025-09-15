package lecture10tutor;

public abstract class Shape {
  abstract double getArea();//not public by default(it's just 'default', therefore, it's needed to declare 'public')
  private String colour;

  public Shape(String colour) {
    this.setColour(colour);
  }

  public String getColour() {
    return this.colour;
  }
  public void setColour(String colour) {
    this.colour = colour;
  }

}
