package task5;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    //Setteing of list of Note objects
    List<Note> notes = new LinkedList<>();
    notes.add(new Note("D", 19));
    notes.add(new Note("C", 20));
    notes.add(new Note("F", 31));
    notes.add(new Note("B", 45));
    notes.add(new Note("C", 73));
    notes.add(new Note("F", 13));
    notes.add(new Note("B", 34));
    notes.add(new Note("C", 53));

    //print out notes list and total duration
    processNotes(notes);
  }
  
  public static void processNotes(List<Note> notes) {
    int total = 0;
    //print each note in list
    for(Note n : notes){
      n.playNote();
      total += n.getDuration();
    }
    System.out.printf("\nTotal duration: %d seconds", total);
  }
}
