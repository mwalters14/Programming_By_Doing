import java.util.Scanner;

public class GenderGame {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    String firstName, lastName, gender, marriedInput;
    boolean married = false;
    int age;

    System.out.print("What is your gender (M or F): ");
    gender = keyboard.next();

    System.out.print("First name: ");
    firstName = keyboard.next();

    System.out.print("Last name: ");
    lastName = keyboard.next();

    System.out.print("Age: ");
    age = keyboard.nextInt();


    if (gender.equals("M") || gender.equals("m")) {
      if (age > 20) {
        System.out.println("Than I shall call you Mr." + lastName);
      }
      else {
        System.out.println("Than I shall call you, " + firstName + lastName);
      }
    }
    if (gender.equals("F") || gender.equals("f")) {
      System.out.print("Are you married, " + firstName + "(Yes or No)? ");
      marriedInput = keyboard.next();

      if (marriedInput.equals("Yes") || marriedInput.equals("yes")) {
        married = true;
      }
      if (marriedInput.equals("No") || marriedInput.equals("no")) {
        married = false;
      }

      if (age > 20) {
        if (married) {
          System.out.println("Than I shall call you Mrs." + lastName);
        }
        if (!married) {
           System.out.println("Than I shall call you Ms." + lastName);
         }
      } else {
        System.out.println("Than I shall call you, " + firstName + lastName);
      }
    }
  }
}
