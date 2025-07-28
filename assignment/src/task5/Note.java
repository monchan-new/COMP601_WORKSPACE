package task5;

public class Note {
  //fields
  private String pitch;
  private int duration;

  //getter/setter for fields
  public String getPitch() {
    return this.pitch;
  }
  public void setPitch(String pitch) {
    this.pitch = pitch;
  }
  
  public int getDuration() {
    return this.duration;
  }
  public void setDuration(int duration) {
    this.duration = duration;
  }

  //costructor w/ arguments
  public Note(String pitch, int duration) {
    this.pitch = pitch;
    this.duration = duration;
  }

  //object method(s)
  public void playNote() {
    System.out.printf("The note %s is played for %d seconds\n", this.pitch, this. duration);
  }

}
