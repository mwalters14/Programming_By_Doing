import java.util.Scanner;
import java.io.*;

class Dog {
  String breed;
  int age;
  double weight;
}

public class ReadData {
  public static void main(String[] args) {
    Scanner file = readFile();
    System.out.println(file.nextLine());
  }

  public static Scanner readFile() {
    File file = new File("dog.txt");
    Scanner sc = null;
    
    try {
        sc = new Scanner(file);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    return sc;
  }
}
