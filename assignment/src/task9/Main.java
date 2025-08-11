package task9;

import java.io.IOError;
import java.io.IOException;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args) {
    String textfile = "datafolder/gamedata.txt";
    try {
      GameApp app = new GameApp(textfile);
      app.game();
    }catch(IOException ioe) {
      out.printf("Perhaps missing text file: %s/%s? \n\n",new Main().getClass().getPackage().getName(), textfile);
    }
  }
}
