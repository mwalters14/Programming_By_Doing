import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileInput {
  public static void main(String[] args) {
    readFile();
  }

  public static void readFile() {
    File file = new File("name.txt");
    try {
        Scanner sc = new Scanner(file);
        System.out.println("I can tell your name is " + sc.nextLine());
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
