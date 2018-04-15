import java.util.Scanner;

class Student {
  String name;
  int grade;
  double average;
}

public class LittleDatabase {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    Student[] students = new Student[3];

    for (int i = 0; i < students.length ; i++ ) {
        students[i] = new Student();

        System.out.print("Enter students " + (i + 1) + " first name: ");
        students[i].name = keyboard.next();

        System.out.print("Enter students " + (i + 1) + " grade: ");
        students[i].grade = keyboard.nextInt();

        System.out.print("Enter students " + (i + 1) + " grade point average: ");
        students[i].average = keyboard.nextDouble();

        System.out.println();
      }

    System.out.print("The names are ");
    for (int i = 0; i < students.length ; i++) {
      System.out.print(students[i].name + " ");
    }

    System.out.println();
    System.out.print("The grades are ");
    for (int i = 0; i < students.length ; i++) {
      System.out.print(students[i].grade + " ");
    }

    System.out.println();
    System.out.print("The averages are ");
    for (int i = 0; i < students.length ; i++) {
      System.out.print(students[i].average + " ");
    }
  }
}
