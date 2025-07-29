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

        SUV suv = new SUV("Hamilton", 100, 8.7);
        suv.printCarInfo();

        suv.drive(220);
        suv.printCarInfo();
        out.println("Crearance: " + suv.getClearance());

    }
}

// only one class (which has file name) can be "public" in one file
// public class Car {}