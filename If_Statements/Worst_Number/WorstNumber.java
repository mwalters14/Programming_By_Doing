import java.util.Scanner;

public class WorstNumber {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    int userGuess;
    int randomNum = 5;

    boolean correct = false;

    System.out.print("I'm thinking of a number between 1-10: ");
    userGuess = keyboard.nextInt();

    if (userGuess == randomNum) {
      System.out.println("You got it! it was " + randomNum);
    } else {
      System.out.println("Nub....what a nub, it was " + randomNum);
    }
  }
}
