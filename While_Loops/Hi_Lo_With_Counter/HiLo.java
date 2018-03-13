import java.util.Scanner;
import java.util.Random;

public class HiLo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random number = new Random();

    int guess, randomNum;
    int tries = 0;
    int maxTries = 6;

    randomNum = 1 + number.nextInt(100);
    System.out.print("I'm thinking of a number between 1 - 100: ");
    guess = input.nextInt();
    tries++;

    while (tries < maxTries && guess != randomNum) {
       if (guess > randomNum) {
        System.out.print("To high! guess again: ");
      } else if (guess < randomNum) {
        System.out.print("To low! guess again: ");
      }

      guess = input.nextInt();
      tries++;
    }

    if (guess == randomNum) {
      System.out.println("Wow that's incredible you had a 1 in 100 chance to guess " + randomNum);
      System.out.println("Your prize is nothing!");
    } else {
      System.out.println("You failed. You have attempted " + maxTries + " times, the number was " + randomNum + " genius." );
    }
    }
}
