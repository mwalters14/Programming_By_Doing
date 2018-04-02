import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ThreeNumSum {
  public static void main(String[] args) {
    readFile();
  }

  public static int sum(int a, int b, int c) {
    return a + b + c;
  }

  public static void readFile() {
    File file = new File("numbers.txt");
    try {
        Scanner sc = new Scanner(file);
        int total = 0;
        while (sc.hasNext()) {
          int number = sc.nextInt();
          total += number;
        }
        System.out.print("Total of numbers in file is " + total);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
