package lecture7tutor;

public class PostIt {
  private double width;
  private double length;
  private String colour;

  //Usage: PostIt it = new PostIt()
  public PostIt() {
    this.setWidth(100);
    this.setLength(200);
    this.setColour("white");
  }

  //Usage: PostIt is = new PostIt("white")
  public PostIt(String colour) {
    this.setColour(colour);
    this.setWidth(100);
    this.setLength(150);
  }

  //Usage: PostIt it = new PostIt(200, 300);
  public PostIt(double width, double length) {
    this.setWidth(width); 
    this.setLength(length);
    this.setColour("orange");
  }

  //Usage: PostIt it = new PostIt(200, 300, "red");
  public PostIt(double width, double length, String colour) {
    this.setWidth(width);;
    this.setLength(length);;
    this.setColour(colour);;
  }

  public double getWidth() {
    return this.width;
  }
  public void setWidth(double width) {
    this.width = width;
  }
  public double getLength() {
    return this.length;
  }
  public void setLength(double length) {
    this.length = length;
  }
  public String getColour() {
    return this.colour;
  }
  public void setColour(String colour) {
    this.colour = colour;
  }

}
