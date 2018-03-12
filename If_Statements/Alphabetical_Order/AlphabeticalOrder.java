import java.util.Scanner;

public class AlphabeticalOrder{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    String lastName;

    System.out.println("Let's see how long of a wait you've got.");
    System.out.print("Enter your last name: ");
    lastName = keyboard.next();

    if ("Carswell".compareTo(lastName) >= 0) {
      System.out.println("You don't have a long wait!");
    } else if ("Jones".compareTo(lastName) >= 0) {
      System.out.println("It's not bad.");
    } else if ("Smith".compareTo(lastName) >= 0) {
      System.out.println("Looks like a bit of a wait");
    } else if ("Young".compareTo(lastName) >= 0) {
        System.out.println("It's gonna be a while");
    } else if ("Young".compareTo(lastName) <= 0) {
      System.out.println("Not going anywhere for a while?");
    }
  }
}
