import java.util.Scanner;
import java.io.*;

public class VowelCapitalization {
  public static void main(String[] args) {
    Scanner sc = read_file("vowels.txt");

    while (sc.hasNext()) {
      String text = sc.nextLine();
      capitalize(text);
    }
  }

  public static void capitalize(String text) {
    char cap;
    for (int i = 0; i < text.length(); i++ ) {
      if (check_char(text.charAt(i))) {
        cap = Character.toUpperCase(text.charAt(i));
        System.out.print(cap);
      } else {
        System.out.print(text.charAt(i));
      }
    }
    System.out.println("");
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

  public static boolean check_char(char e) {
    boolean result = false;
    if (e == 'a' || e == 'e' || e == 'i' || e == 'o' || e == 'u') {
      result = true;
    }
    return result;
  }
}
