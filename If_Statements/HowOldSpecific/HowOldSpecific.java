import java.util.Scanner;

public class HowOldSpecific{
  public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);

      int age;

      System.out.print("How old are you? ");
      age = keyboard.nextInt();

      if (age < 16) {
        System.out.println("You can't drive");
      } else if (age < 18) {
        System.out.println("You can drive but you can't vote");
      } else if (age < 21) {
        System.out.println("You can drive and vote but you can't drink");
      } else if (age < 25) {
        System.out.println("You can't rent a car");
      } else {
        System.out.println("You can do anything");
      }
  }
}
