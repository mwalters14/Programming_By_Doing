import java.util.Scanner;
import java.util.Random;

public class HiLo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random number = new Random();

    int guess, randomNum;

    randomNum = 1 + number.nextInt(100);
    System.out.print("I'm thinking of a number between 1 - 100: ");
    guess = input.nextInt();

    if (guess == randomNum) {
      System.out.println("Wow that's incredible you had a 1 in 100 chance to guess " + randomNum);
      System.out.println("Your prize is nothing!");
    } else if (guess > randomNum) {
      System.out.println("To high! I was thinking of " + randomNum);
    } else if (guess < randomNum) {
      System.out.println("To low! I was thinking of " + randomNum);
    }
  }
}
