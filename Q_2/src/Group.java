public class Group {
  private String name;
  private int groupSize;



  public Group(String name, int groupSize) {
    this.name = name;
    this.groupSize = groupSize;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }



  public int getGroupSize() {
    return this.groupSize;
  }

  public void setGroupSize(int groupSize) {
    this.groupSize = groupSize;
  }
}