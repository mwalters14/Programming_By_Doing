import java.util.Scanner;

public class BabyCalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    double num1, num2;
    String symbol;

    System.out.print("Enter an equation: ");
    num1 = keyboard.nextDouble();
    symbol = keyboard.next();
    num2 = keyboard.nextDouble();

    while (num1 != 0) {
      if (symbol.equals("+")) {
        Add.Add(num1, num2);
      } else if (symbol.equals("-")) {
        Subtract.Subtract(num1, num2);
      }
      System.out.print("Enter an equation: ");
      num1 = keyboard.nextDouble();
      symbol = keyboard.next();
      num2 = keyboard.nextDouble();
    }
  }
}
