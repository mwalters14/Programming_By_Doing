// Write a program the gets three integers from the user. Count from
// the first number to the second number in increments of the third number.

import java.util.Scanner;

public class CountingMachine {
  public static void main(String[] args) {
    Start();
  }


  public static void Start() {
    int from = 0;
    int to = 0;
    int inc = 0;

    System.out.print("Count from: ");
    from = User();

    System.out.print("Count to: ");
    to = User();

    System.out.print("Count by: ");
    inc = User();

    Counter(from, to, inc);

  }
  public static void Counter(int from, int to, int inc) {
    for (int i = from ;i <= to ;i += inc ) {
      System.out.println(i);
    }
  }

  public static int User() {
      Scanner keyboard = new Scanner(System.in);
      int number;
      number = keyboard.nextInt();

      return number;
    }
}
