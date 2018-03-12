import java.util.Random;
import java.util.Scanner;

public class GuessGame {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random number = new Random();

    int guess;
    int random = 1 + number.nextInt(10);

    System.out.print("I'm thinking of a number between 1-10: ");
    guess = input.nextInt();

    if (guess == random) {
      System.out.println("You guessed correct! It was " + random);
    } else {
      System.out.println("You were wrong scrub ha, it was " + random);
    }
  }
}
