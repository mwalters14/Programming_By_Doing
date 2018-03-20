// Write a program that gets an integer from the user
// Count from 0 to that number.

import java.util.Scanner;

public class CountingMachine {
  public static void main(String[] args) {
    Start();
  }

  public static void Start() {
    int number = User();
    Counter(number);
  }

  public static void Counter(int times) {
    for (int i = 0; i <= times ; i++ ) {
      System.out.print(i + " ");
    }
  }

  public static int User() {
    Scanner keyboard = new Scanner(System.in);

    int number;

    System.out.println("I will count to any number you enter.");
    System.out.println("Don't believe me?");
    System.out.print("Enter a number: ");
    number = keyboard.nextInt();

    return number;
  }
}
