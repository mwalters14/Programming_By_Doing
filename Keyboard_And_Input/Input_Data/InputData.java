import java.util.Scanner;

public class InputData {
  public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String firstName;
        String lastName;
        int grade;
        int studentID;
        String loginUser;
        float gpa;

        System.out.println("Please enter the following inforamtion");

        System.out.print("First name: ");
        firstName = keyboard.next();

        System.out.print("Last name: ");
        lastName = keyboard.next();

        System.out.print("Grade (9-12):");
        grade = keyboard.nextInt();

        System.out.print("Student ID:");
        studentID = keyboard.nextInt();

        System.out.print("Login:");
        loginUser= keyboard.next();

        System.out.print("GPA:");
        gpa = keyboard.nextFloat();

        System.out.println("Your information:");
        System.out.println("    Login: " + loginUser);
        System.out.println("    ID: " + studentID);
        System.out.println("    Name: " + lastName + ", " + firstName);
        System.out.println("    GPA: " + gpa);
        System.out.println("    Grade: " + grade);
  }
}
