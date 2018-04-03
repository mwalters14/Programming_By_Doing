import java.util.*;
import java.io.*;

public class FindingValue{
  public static void main(String[] args) {
    int [] array = fill_array();
    find_value(array);
    System.out.println("Thanks for using Value Finder.");
  }

  public static void find_value(int [] array) {
    System.out.print("Array: ");
    for (int i = 0; i < array.length ; i++ ) {
      System.out.print(array[i] + " ");
    }

    System.out.println("");
    int value_toFind = 0;

    while (value_toFind != -1) {
      value_toFind = value_toFind();
      for (int i = 0; i < array.length ; i++ ) {
        if (array[i] == value_toFind) {
          System.out.println(array[i] + " is in the array");
        }
      }
    }
  }

  public static int[] fill_array() {
    int [] array = new int[10];
    for (int i = 0; i < array.length ; i++ ) {
      array[i] = get_rand(99);
    }
    return array;
  }

  public static int value_toFind() {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Value to find (-1 to quit): ");
    int number = keyboard.nextInt();
    return number;
  }

  public static int get_rand(int max) {
    Random random = new Random();
    int number;
    number = 1 + random.nextInt(max);
    return number;
  }
}
