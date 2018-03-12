import java.util.Scanner;
import java.util.Random;

public class Dice {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random number = new Random();

    int roll1,roll2,total;

    roll1 = number.nextInt(6);
    roll2 = number.nextInt(6);
    total = roll1 + roll2;

    System.out.println("Roll #1: " + roll1);
    System.out.println("Roll #2: " + roll2);
    System.out.println("Total: " + total);
  }
}
