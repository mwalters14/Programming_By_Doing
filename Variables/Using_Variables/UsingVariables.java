/*
Write a program that creates three variables: an int, a double, and a String.

Put the value 113 into the first variable, the value 2.71828 into the second, and the value "Computer Science" into the third. It does not matter what you call the variables... this time.

Then, display the values of these three variables on the screen, one per line.
*/

public class UsingVariables {
  public static void main(String[] args) {
    int number;
    double decimal;
    String string;

    number = 113;
    decimal = 2.71828;
    string = "Computer Science!";

    System.out.println("Number: " + number);
    System.out.println("Decimal: " + decimal);
    System.out.println("String: " + string);
  }
}
