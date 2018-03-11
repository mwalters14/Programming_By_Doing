import java.util.Scanner;

public class TwoMoreQuestions {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    String response1;
    String response2;

    System.out.println("TWO MORE QUESTIONS, BABY! Hell yeah!");
    System.out.println("\n Think of something, and I'll guess it for sure.");

    System.out.println("\n Question 1: Is it an animal?");
    response1 = keyboard.next();

    System.out.println("Question 2: Is it small?");
    response2 = keyboard.next();

    if (response1.equals("yes") && response2.equals("yes")) {
      System.out.println("Your a joke, it's a fox.");
    }
    if (response1.equals("yes") && response2.equals("no")) {
      System.out.println("I laugh at your effort, it's a dragon.");
    }
    if (response1.equals("no") && response2.equals("yes")) {
      System.out.println("Small like a cellphone");
    }
    if (response1.equals("no") && response2.equals("no")) {
      System.out.println("Big like a building.");
    }
  }
}
