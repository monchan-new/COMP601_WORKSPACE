
public class Ticket {

     //complete this class according to requirements given below.
  private String tickno;
  private double price;


  public Ticket(String tickno, double price) {
    this.tickno = tickno;
    this.price = price;
  }

  public int getPoints() {
    int points = (int)price / 100; 
    return points;
  }

  public String getTickno() {
    return this.tickno;
  }

  public void setTickno(String tickno) {
    this.tickno = tickno;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


}