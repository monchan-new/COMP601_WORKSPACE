package lecture10tutor;

public class Circle extends Shape implements Sidely {
  private double radius;
  public Circle(String colour, double radius) {
    super(colour);
    this.setRadius(radius);
  }

  @Override
  public int getSides() {
    return 1;
  }  
  @Override
  double getArea() {
    // because 'getArea' is declared w/o public in Shape class, it needs to be less than 'package default'
    return Math.pow(radius,2) * Math.PI;
  }
  
  public double getRadius() {
    return this.radius;
  }
  public void setRadius(double radius) {
    this.radius = radius;
  }
}
