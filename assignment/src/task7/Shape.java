package task7;

public class Shape {
  private String colour;

  public String getColour() {
    return this.colour;
  }
  public void setColour(String colour) {
    this.colour = colour;
  }

  public Shape(String colour) {
    this.setColour(colour);
  }

  public String getShapeType() {
    return "I'm a Shape";
  }
}
