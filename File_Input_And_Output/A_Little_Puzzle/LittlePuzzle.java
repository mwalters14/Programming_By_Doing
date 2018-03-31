import java.util.Scanner;
import java.io.*;

public class LittlePuzzle {
  public static void main(String[] args) {
    test();
  }

  public static void test() {
    String filename = "puzzle2.txt";
    Scanner file = read_file(filename);
    String text = file.nextLine();
    file.close();
    for (int i = 2; i < text.length(); i += 3 ) {
      System.out.print(text.charAt(i));
    }
  }

  public static Scanner read_file(String filename) {
    File file = new File(filename);
    Scanner sc = null;
    try {
        sc = new Scanner(file);
    } catch (IOException e) {
        e.printStackTrace();
    }
    return sc;
  }
}
