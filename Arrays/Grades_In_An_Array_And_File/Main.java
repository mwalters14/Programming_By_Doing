import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    String name = get_name();
    int[] array = show_grades();
    write_toFile(name, array);
  }

  public static void write_toFile(String name, int[] array) {
    try {
      PrintWriter writer = new PrintWriter(new FileWriter("C:\\Java\\Programming_By_Doing\\Arrays\\Grades_In_An_Array_And_File\\Grades.txt"));

      writer.println(name);
      writer.println("\nHere are your randomly-generated grades");
      for (int i = 0; i < array.length ; i++) {
        writer.println("Grade " + i + ": " + array[i]);
      }

      writer.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    System.out.println("\nData stored into Grades.txt");
  }
  public static int[] show_grades() {
    System.out.println("\nHere are your randomly-generated grades");
    int[] array = fill_array();
    for (int i = 0; i < array.length ; i++) {
      System.out.println("Grade " + i + ": " + array[i]);
    }
    return array;
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
    System.out.print("Enter your name: ");
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
