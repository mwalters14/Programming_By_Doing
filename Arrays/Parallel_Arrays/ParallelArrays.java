import java.util.*;

public class ParallelArrays {
  public static void main(String[] args) {

    String[] names = {"Mitchell", "Ortiz", "Luu", "Barack", "Brooks"};
    double[] grades = {99.5, 78.5, 95.6, 96.8, 82.7};
    int[] student_id = {123456, 813225, 823669, 307760, 827131};
    int id_toFind = 0;

    display_values(names, grades, student_id);
    value_toFind(id_toFind, names, grades, student_id);
  }

  public static void value_toFind(int id_toFind, String[] names, double[] grades, int[] student_id) {
    while (id_toFind != -1) {
      id_toFind = id_toFind();
      boolean found = false;
      for (int i = 0; i < student_id.length ; i++ ) {
        if (id_toFind == student_id[i]) {
          found = true;
          System.out.println("Found in slot " + i);
          System.out.println("Name: " + names[i]);
          System.out.println("Average: " + grades[i]);
          System.out.println("ID: " + student_id[i]);
        }
      }
      if (!found) {
        System.out.println("That student id was not found");
      }
    }
  }

  public static int id_toFind() {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("\nID number to find: ");
    int id_toFind = keyboard.nextInt();
    return id_toFind;
  }

  public static void display_values(String[] names, double[] grades, int[] student_id) {
    System.out.println("Values:\n");
    for (int i = 0; i < names.length ; i++ ) {
      System.out.print(names[i] + " " + grades[i] + " " + student_id[i]);
      System.out.println("");
    }
  }
}
