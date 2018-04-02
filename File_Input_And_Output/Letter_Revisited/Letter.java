import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Letter {
  public static void main(String[] args) {
    try {
      PrintWriter writer = new PrintWriter(new FileWriter("C:\\Users\\mwalters\\Desktop\\test.txt"));

      writer.println("+----------------------------------------------------------------+");
      writer.println("|                                                          ###   |");
      writer.println("|                                                          ###   |");
      writer.println("|                                                          ###   |");
      writer.println("|                                                                |");
      writer.println("|                                    Myron Walters               |");
      writer.println("|                                    Pluto Dr                    |");
      writer.println("|                                    Olmsted Falls, OH           |");
      writer.println("|                                                                |");
      writer.println("|                                                                |");
      writer.println("+----------------------------------------------------------------+");

      writer.close();
    } catch (IOException e) {
        e.printStackTrace();
    }

  }
}
