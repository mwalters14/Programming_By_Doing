import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    show_grades();
  }

  public static void show_grades() {
    System.out.println("Here are your randomly-generated grades");
    int[] array = fill_array();
    for (int i = 0; i < array.length ; i++) {
      System.out.println("Grade " + i + ": " + array[i]);
    }
  }

  public static int[] fill_array() {
    int[] array = new int[5];
    for (int i = 0; i < array.length ; i++ ) {
      array[i] = get_rand(99);
    }
    return array;
  }

  public static String get_name() {
    Scanner keyboard = new Scanner(System.in);
    String name;
    name = keyboard.nextLine();
    return name;
  }

  public static int get_rand(int max) {
    Random random = new Random();
    int number;
    number = 1 + random.nextInt(max);
    return number;
  }

}
