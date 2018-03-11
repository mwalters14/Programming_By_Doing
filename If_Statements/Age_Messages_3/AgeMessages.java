import java.util.Scanner;

public class AgeMessages {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    String name;
    int age;

    System.out.print("Enter your name: ");
    name = keyboard.nextLine();

    System.out.print("Enter your age: ");
    age = keyboard.nextInt();

    if (age < 16) {
      Message("You can't drive", name);
    }
    if (age > 16 && age < 17) {
      Message("You can drive but not vote", name);
    }
    if (age > 18 && age < 24) {
      Message("You can vote but not rent a car", name);
    } else {
      Message("You can do anything", name);
    }
  }

  public static void Message(String message, String name) {
    System.out.println(message + ", " + name);
  }
}
