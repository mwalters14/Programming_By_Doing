import java.util.Scanner;

public class AskingQuestions{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    int age;
    String height;
    double weight;

    System.out.println("How old are you?");
    age = keyboard.nextInt();

    System.out.println("How tall are you?");
    height = keyboard.next();

    System.out.println("How much do you weigh?");
    weight = keyboard.nextDouble();

    System.out.println("So you're " + age + " years old and your " + height + " inches tall and weigh " + weight + " pounds." );
  }
}
