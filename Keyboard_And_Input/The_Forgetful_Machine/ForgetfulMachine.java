import java.util.Scanner;

public class ForgetfulMachine{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    String word;
    String secondWord;
    int number;
    int secondNumber;

    System.out.println("Give me a word");
    word = keyboard.next();

    System.out.println("Give me another word");
    secondWord = keyboard.next();

    System.out.println("Great, what's your favorite number");
    number = keyboard.nextInt();

    System.out.println("Great, what's your second favorite number");
    secondNumber = keyboard.nextInt();
  }
}
