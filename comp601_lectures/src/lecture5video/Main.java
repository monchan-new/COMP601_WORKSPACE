package lecture5video;

import static java.lang.System.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Car car1 = new Car();
        // car1.printCarInfo();

        // Car car2 = new Car("Auckland", 55.5);
        // car2.printCarInfo();

        // car2.drive(130);
        // car2.setLocation("Hamilton");
        // car2.printCarInfo();

        // car2.refill(30);
        // System.out.println(car2.getFuelInTank());
        // System.out.println(car2.getLocation());

        // SUV suv = new SUV("Hamilton", 100, 8.7);
        // suv.printCarInfo();

        // suv.drive(220);
        // suv.printCarInfo();

        Car car01, car02, car03;

        //dynamic binding behavior (bind not with variable's reference type but with actual object(subclass) = "Subtype Polimorphism"
        car01 = new Car("Auckland", 100);
        car02 = new SUV("Auckland", 100, 8.7);
        car03 = new MPV("Auckland", 100, 7);

        //polimorphism(many forms): treat different classes in the same interface: ex) can call various subclass' overidden methods in the same manner (by dynamic binding)
        car01.printCarInfo();
        car02.printCarInfo();
        car03.printCarInfo();

        List<Car> cars = new LinkedList<>();
        cars.add(new Car("Auckland", 100));
        cars.add(new SUV("Auckland",100, 8.7));
        cars.add(new MPV("Auckland", 100, 7));

        for(Car c : cars) {
            c.printCarInfo();
        }
    }
}

// only one class (which has file name) can be "public" in one file
// public class Car {}