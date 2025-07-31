package task7;

public class Rectangle extends Shape {
  double height, width;

  public double getHeight() {
    return this.height;
  }
  public void setHeight(double height) {
    this.height = height;
  }

  public double getWidth() {
    return this.width;
  }
  public void setWidth(double width) {
    this.width = width;
  }

  public Rectangle(String colour, double height, double width) {
    super(colour);
    this.setHeight(height);
    this.setWidth(width);
  }
  @Override public String getShapeType() {
    return "I'm a Rectangle";
  }

  public double getPerimeter() {
    return this.getHeight() *2 + this.getWidth() * 2;
  }
}
