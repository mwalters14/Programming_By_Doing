import java.util.Scanner;

public class TwoQuestions {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    String userString, userBool;

    System.out.println("TWO QUESTIONS!");
    System.out.println("Think of an object, and I'll try to guess it. \n");

    System.out.println("Question 1: Is it animal, vegetable, or mineral?");
    userString = keyboard.next();

    System.out.println("Question 2: Is it bigger than a breabox?");
    userBool = keyboard.next();

    if (userString.equals("animal") ) {
      if (userBool.equals("yes") ) {
        System.out.println("You're thinking of a lion! I know it.");
      } else if (userBool.equals("no")) {
        System.out.println("It's a rabbit! To easy.");
      } else {
        System.out.println(userBool + " Does not tell me the answer to question 2, shutting down!");
      }
    } else if (userString.equals("vegetable")) {
        if (userBool.equals("yes")) {
          System.out.println("It's a pumpkin!");
      } else if (userBool.equals("no")) {
          System.out.println("It's a cucumber");
      } else {
        System.out.println(userBool + " Does not tell me the answer to question 2, shutting down!");
      }
    } else if (userString.equals("mineral")) {
        if (userBool.equals("yes")) {
          System.out.println("I'm thinking that you're thinking of a Mountain!");
      } else if (userBool.equals("no")) {
          System.out.println("Heh, your predictable it's a rock");
      } else {
        System.out.println(userBool + " Does not tell me the answer to question 2, shutting down!");
      }
    }
  }
}
