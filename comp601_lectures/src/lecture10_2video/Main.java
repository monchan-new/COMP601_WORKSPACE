package lecture10_2video;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    // Polymmorphism via inheritance
    List<Mammal> mammals = new LinkedList<>();
    Mammal m = new Whale(3000);
    mammals.add(m);
    m = new Seal(100);
    mammals.add(m);
    m = new Lion(120);
    mammals.add(m);
    m = new Cheetah(50);
    mammals.add(m);
    for (Mammal mml : mammals) {
      System.out.println(mml.getWeigth());
    }

    // LandBound xx = new LandBound();//interface can't instantiate
    // Polymorphism via LandBound interface
    List<LandBound> landAnims = new LinkedList<>();
    LandBound la = new Lion(120);
    landAnims.add(la);
    la = new Cheetah(50);
    landAnims.add(la);
    la = new Seal(100);
    landAnims.add(la);
    for (LandBound lb : landAnims) {
      lb.run();
    }
    // Ploymorphism via SeaBound interface
    List<SeaBound> seaAnims = new LinkedList<>();
    SeaBound sa = new Whale(3800);
    seaAnims.add(sa);
    sa = new Seal(100);
    seaAnims.add(sa);
    for (SeaBound sb : seaAnims) {
      sb.swim();
    }

  }
}

class Mammal {
  private double weigth;

  public Mammal(double weigth) {
    this.setWeigth(weigth);
  }

  public double getWeigth() {
    return this.weigth;
  }

  public void setWeigth(double weigth) {
    this.weigth = weigth;
  }

}

interface LandBound {
  void run();// implictly means "public abstract"
}

interface SeaBound {
  void swim();
}

// class Whale extends Mammal implements SeaBound, OtherInterface
class Whale extends Mammal implements SeaBound {
  public Whale(double weigth) {
    super(weigth);
  }

  public void swim() {
    System.out.println("Whale swimming...");
  }
}

class Seal extends Mammal implements SeaBound, LandBound {
  public Seal(double weigth) {
    super(weigth);
  }

  public void swim() {
  // '@override' is unnecessary 
    System.out.println("Seal swimming...");
  }
  public void run() {
    System.out.println("Seal running...");
  }
}

class Lion extends Mammal implements LandBound {
  public Lion(double weigth) {
    super(weigth);
  }

  public void run() {
    System.out.println("Lion running...");
  }
}

class Cheetah extends Mammal implements LandBound {
  public Cheetah(double weigth) {
    super(weigth);
  }

  public void run() {
    System.out.println("Cheetah running...");
  }
}
