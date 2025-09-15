package lecture10tutor;

public class Rectangule extends Shape implements Sidely {
  private double width;
  private double height;
  public Rectangule(String colour, double width, double height) {
    super(colour);
    this.setWidth(width);
    this.setHeight(height);
  }

  @Override
  public int getSides() {
    return 4;
  }  
  @Override
  double getArea() {
    return width * height;
  }

  public double getWidth() {
    return this.width;
  }
  public void setWidth(double width) {
    this.width = width;
  }
  public double getHeight() {
    return this.height;
  }
  public void setHeight(double height) {
    this.height = height;
  }
}
