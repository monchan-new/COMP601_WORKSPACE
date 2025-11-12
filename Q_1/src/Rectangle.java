public class Rectangle {
  private double length;
  private double width;


  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public double calArea(double length, double width) {
    double area = length * width;
    return area;
  }


  public double getLength() {
    return this.length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getWidth() {
    return this.width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

}
