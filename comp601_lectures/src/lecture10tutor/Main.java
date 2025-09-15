package lecture10tutor;
import static java.lang.System.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {

    Circle c = new Circle("white", 2.5);
    Rectangule r = new Rectangule("red", 2, 5);

    //Achieve polymorphism via Sidely interface
    List<Sidely> sides = new LinkedList<>();
    sides.add(c);sides.add(r);
    for(Sidely s : sides) {
      out.printf("I'm %d-sided shape, What am I?\n", s.getSides());
    }
    //Polymorphism via abstract class 'Shape'
    List<Shape> shapes = new LinkedList<>();
    shapes.add(c); shapes.add(r);
    for(Shape s : shapes) {
      out.printf("My area is %.1f, and I'm in %s colour\n", s.getArea(), s.getColour());
    }

  }
}
