import java.io.*;
import java.util.Scanner;

public class DisplayFile {
  public static void main(String[] args) {
    File file = new File("letter.txt");

    try {
      Scanner sc = new Scanner(file);
      while (sc.hasNext()) {
        System.out.println(sc.nextLine());
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
