import java.util.Scanner;
import java.util.Random;

public class BallAndCup {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random number = new Random();

    int guess;
    String cardDefault;
    String cardResult = "";

    cardDefault = "# # #\n1 2 3";
    System.out.println("You slide up to Sly Cooper's shop, you plop down confident of his antics.");
    System.out.println("He glances at you out the corner of his eyes, he waves his hand and suddenly 3 cups appear");

    int correctCup = 1 + number.nextInt(3);

    if (correctCup == 1) {
      cardResult = "Ball ##\n1  2 3";
    } else if (correctCup == 2) {
      cardResult = "# Ball #\n1  2 3";
    } else if (correctCup == 3) {
      cardResult = "# # Ball\n1  2 3";
    }

    System.out.print("Which one is the ball under? ");
    guess = input.nextInt();

    if (guess == correctCup) {
      System.out.println(cardResult);
      System.out.println("You got it right! It was " + correctCup);
    } else {
      System.out.println(cardResult);
      System.out.println("You got it wrong! It was " + correctCup);
    }

  }
}
