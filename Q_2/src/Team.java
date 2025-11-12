public class Team extends Group {
  private String ID;
  private double score;

  public Team(String name, int groupSize, String ID, double score) {
    super(name, groupSize);

    this.ID = ID;
    this.score = score;
  }
  public void displayInfo() {
    System.err.printf("Search result: %-10s%-10d%-10s%-10.1f",super.getName(), super.getGroupSize(), this.getID(), this.getScore());
  }
  public String getID() {
    return this.ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public double getScore() {
    return this.score;
  }

  public void setScore(int score) {
    this.score = score;
  }

}
