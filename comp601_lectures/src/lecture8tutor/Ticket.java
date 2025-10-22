package lecture8tutor;

public class Ticket {
  
  private String tickno;
  private double price;
  public Ticket(String tickno, double price) {
    this.setTickno(tickno);
    this.setPrice(price);
  }
  //shouldn't use fields like this coz can't get values from constructor arguments because fields execute before constructor instatiation
  // public int getAirPoints2 = (int)price / 100 * 3;
  
  public int getAirPoints() {
    int hundreds =  (int)price / 100;
    return hundreds * 3;
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
