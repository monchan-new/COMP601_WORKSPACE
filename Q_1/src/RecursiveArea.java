import java.util.LinkedList;
import java.util.List;
import static java.lang.System.*;

public class RecursiveArea {

  public RecursiveArea() {

      List<Rectangle> rectangles = new LinkedList<>();

      rectangles.add(new Rectangle(1.0, 2.0));

      rectangles.add(new Rectangle(2.0, 3.0));

      rectangles.add(new Rectangle(3.0, 4.0));

      double totalArea = getTotalRectangleArea(rectangles);

      out.printf("Total area: %.2f", totalArea);

  }

  public double getTotalRectangleArea(List<Rectangle> list) {

    //Note, this needs to be a recursive method
    if(list != null && list.size()>0) {
      List<Rectangle> sublist = list.subList(1, list.size());
      var rect = list.get(0);
      return rect.calArea(rect.getLength(), rect.getWidth()) + getTotalRectangleArea(sublist);
    }else {
      return 0;
  }
}
}
