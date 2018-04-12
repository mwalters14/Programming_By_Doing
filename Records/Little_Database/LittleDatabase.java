import java.util.Scanner;

class Student {
  String name;
  int grade;
  double average;
}

public class LittleDatabase2 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    Student[] students = new Student[3];

    students[0] = new Student();
    System.out.print("Enter student 1's name: ");
    students[0].name = keyboard.next();

    System.out.print("Enter student 1's grade: ");
    students[0].grade = keyboard.nextInt();

    System.out.print("Enter student 1's average: ");
    students[0].average = keyboard.nextDouble();


    System.out.println();

    students[1] = new Student();
    System.out.print("Enter student 2's name: ");
    students[1].name = keyboard.next();

    System.out.print("Enter student 2's grade: ");
    students[1].grade = keyboard.nextInt();

    System.out.print("Enter student 2's grade point average: ");
    students[1].average = keyboard.nextDouble();

    System.out.println();

    students[2] = new Student();
    System.out.print("Enter student 3's name: ");
    students[2].name = keyboard.next();

    System.out.print("Enter student 3's grade: ");
    students[2].grade = keyboard.nextInt();

    System.out.print("Enter student 3's grade point average: ");
    students[2].average = keyboard.nextDouble();

    System.out.println("The names are " + students[0].name + ", " + students[1].name + ", " + students[2].name);
    System.out.println("The grades are " + students[0].grade + ", " + students[1].grade + ", " + students[2].grade);
    System.out.println("The averages are " + students[0].average + ", " + students[1].average + ", " + students[2].average);
  }
}
