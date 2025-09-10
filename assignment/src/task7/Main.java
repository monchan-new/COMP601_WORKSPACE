package task7;

import java.util.*;

// import static java.lang.System.*;
// import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    List<Shape> shapes = new LinkedList<>();
    shapes.add(new Shape("white"));
    shapes.add(new Rectangle("red", 10, 6));
    shapes.add(new Rectangle("black", 20, 9));
    shapes.add(new Shape("orange"));

    showShapeNames(shapes);//produces output part 1

    Rectangle[] rectangleArray1 = {
      new Rectangle("white", 4, 3),
      new Rectangle("red", 9, 5),
      new Rectangle("purple", 3, 6),
      new Rectangle("orange", 15, 10),
      new Rectangle("black", 4, 14)
    };

    Rectangle[] rectangleArray2 = {
      new Rectangle("pink", 3, 4),
      new Rectangle("red", 10, 2),
      new Rectangle("white", 8, 5),
      new Rectangle("blue", 14, 4),
      new Rectangle("bindle", 10, 15)
    };

    //produces output part 2
    countOverlapRectanbles(rectangleArray1,rectangleArray2);
  }

  public static void showShapeNames(List<Shape> shapes) {
    System.out.println("Sample run output part 1:\n");
    for(Shape sh : shapes) {
      System.out.println(sh.getShapeType());
    }
  }

  public static void countOverlapRectanbles(Rectangle[] group1, Rectangle[] group2) {
    int countColors = 0;
    int countPerimeter = 0;
    for(Rectangle g1 : group1) {
      for(Rectangle g2 : group2) {
        if(g1.getColour().equals(g2.getColour()))
        countColors++;
        if(g1.getPerimeter() == g2.getPerimeter())
        countPerimeter++;
      }
    }
    System.out.println("\n\nSample run output part 2:");
    System.out.printf("There are %d Rectangle objects with overlapping colour between the two arrays\n", countColors);
    System.out.printf("There are %d Rectangle objects with overlapping perimeter between the two arrays\n", countPerimeter);
  }
}
