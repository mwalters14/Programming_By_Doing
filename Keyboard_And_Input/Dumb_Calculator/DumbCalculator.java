import java.util.Scanner;

public class DumbCalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    double firstNum;
    double secondNum;
    double thirdNum;
    double calculatedNumber;

    System.out.print("What is your first number? ");
    firstNum = keyboard.nextDouble();

    System.out.print("What is your second number? ");
    secondNum = keyboard.nextDouble();

    System.out.print("What is your third number? ");
    thirdNum = keyboard.nextDouble();

    calculatedNumber = CalculateNumbers(firstNum,secondNum,thirdNum);
    System.out.print("(" + firstNum + " + " + secondNum + " + " + thirdNum + ")" + " / 2 = " + calculatedNumber);

  }

  public static double CalculateNumbers(double num1, double num2, double num3) {
    return ((num1+num2+num3) / 2);
  }
}
