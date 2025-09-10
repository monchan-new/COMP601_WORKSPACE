package lecture8tutor;

public class Ticket {
  
  private String tickno;
  private double price;
  public Ticket(String tickno, double price) {
    this.setTickno(tickno);
    this.setPrice(price);
  }
  //shouldn't use fields coz can't initialize value for fields because fields execute before constructor
  public int getAirPoints2 = (int)price / 100 * 3;
  
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
