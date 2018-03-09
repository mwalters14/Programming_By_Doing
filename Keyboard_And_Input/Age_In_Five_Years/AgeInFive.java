import java.util.Scanner;

public class AgeInFive {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    String name;
    int age;

    System.out.print("Hello. What is your name? ");
    name = keyboard.nextLine();

    System.out.print("Hi, " + name + " How old are you? ");
    age = keyboard.nextInt();

    int agePlusFive = age + 5;
    int ageMinusFive = age - 5;

    System.out.println(name + " Did you know that in five years you will be " + agePlusFive + " years old.");
    System.out.println("And five years ago you were " + ageMinusFive + " years old, imagine that!");
  }
}
