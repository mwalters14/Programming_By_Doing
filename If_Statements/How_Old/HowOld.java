import java.util.Scanner;

public class HowOld {
  public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);

      int age;

      System.out.print("How old are you? ");
      age = keyboard.nextInt();

      if (age < 16) {
        System.out.println("You can't drive");
      }

      if (age < 18) {
        System.out.println("You can't vote");
      }

      if (age < 21) {
        System.out.println("You can't drink");
      }

      if (age < 25) {
        System.out.println("You can't rent a car");
      }

      if (age > 25) {
        System.out.println("You can do anything that's legal");
      }
    }
}
