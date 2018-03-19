import java.util.Scanner;

public class AddingValue {
  public static void main(String[] args) {
    Start();
  }

  public static void Start() {
    int number = getNumber();
    AddValue(number);
  }
  public static void AddValue(int to) {
    int total = 0;
    for (int i = 1; i <= to  ; i++ ) {
      System.out.print(i + " ");
      total = total + i;
    }
    System.out.println("\nThe sum is " + total);
  }

  public static int getNumber() {
    Scanner keyboard = new Scanner(System.in);
    int number;

    System.out.print("Enter a number: ");
    number = keyboard.nextInt();

    return number;
  }
}
