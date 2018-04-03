import java.util.*;
import java.io.*;

public class LargestValue{
  public static void main(String[] args) {
    int [] array = fill_array();
    find_value(array);
  }

  public static void find_value(int [] array) {
    System.out.print("Array: ");
    for (int i = 0; i < array.length ; i++ ) {
      System.out.print(array[i] + " ");
    }

    int largest = 0;

    for (int i = 0; i < array.length ; i++ ) {
      if (largest < array[i]) {
        largest = array[i];
      }
    }

    System.out.println("");
    System.out.println("The largest value was " + largest);
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
