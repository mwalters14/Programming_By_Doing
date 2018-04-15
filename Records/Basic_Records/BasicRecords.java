import java.util.Scanner;

class Student {
  String name;
  int grade;
  double average;

}

public class BasicRecords {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    Student one = new Student();
    Student two = new Student();
    Student three = new Student();

    System.out.print("Enter first student's name: ");
    one.name = keyboard.next();

    System.out.print("Enter student grade: ");
    one.grade = keyboard.nextInt();

    System.out.print("Enter student grade point average: ");
    one.average = keyboard.nextDouble();
//-------------------------------------------------------------------------------------------
    System.out.print("Enter second student's name: ");
    two.name = keyboard.next();

    System.out.print("Enter student grade: ");
    two.grade = keyboard.nextInt();

    System.out.print("Enter student grade point average: ");
    two.average = keyboard.nextDouble();
//-------------------------------------------------------------------------------------------
    System.out.print("Enter third student's name: ");
    three.name = keyboard.next();

    System.out.print("Enter student grade: ");
    three.grade = keyboard.nextInt();

    System.out.print("Enter student grade point average: ");
    three.average = keyboard.nextDouble();
//-------------------------------------------------------------------------------------------

  System.out.println("The names are " + one.name + ", " + two.name + ", " + three.name);
  System.out.println("The grades are " + one.grade + ", " + two.grade + ", " + three.grade);
  System.out.println("The averages are " + one.average + ", " + two.average + ", " + three.average);

  double average = (one.average + two.average + three.average) / 3;
  System.out.println("The averages of all the students is: " + average);
  }
}
