import java.util.Scanner;

public class LetterCount {
  public static void main(String[] args) {
    Start();
  }

  public static void Start() {
    String message = Message();
    System.out.println("\nYour message is " + message.length() + " long");
    System.out.println("The first character is at position " + (message.charAt(0)) + " and is '" + message.charAt(0) + "'.");
    System.out.println("The last character is at position " + (message.length() - 1) + " and is '" + message.charAt(message.length() - 1) + "'.");

    System.out.println("\nHere are all the characters, one at a time: \n");
    Counter(message);
  }

  public static void Counter(String message) {
    int aCount = 0;
    int eCount = 0;
    int iCount = 0;
    int oCount = 0;
    int uCount = 0;

    for (int i = 0; i <= message.length() - 1; i++ ) {
      System.out.println(i + " - " + message.charAt(i));
      if (message.charAt(i) == 'A' || message.charAt(i) == 'a') {
        aCount++;
      } else if (message.charAt(i) == 'E' || message.charAt(i)== 'e') {
        eCount++;
      } else if (message.charAt(i) == 'I' || message.charAt(i) == 'i') {
        iCount++;
      } else if (message.charAt(i) == 'O' || message.charAt(i) == 'o') {
        oCount++;
      }
      else if (message.charAt(i) == 'U' || message.charAt(i) == 'u') {
        uCount++;
      }
    }

    System.out.println("\nYour message contains the letter 'a' " + aCount + " times. Isn't that interesting?");
    System.out.println("Your message contains the letter 'e' " + eCount + " times. Isn't that interesting?");
    System.out.println("Your message contains the letter 'i' " + iCount + " times. Isn't that interesting?");
    System.out.println("Your message contains the letter 'o' " + oCount + " times. Isn't that interesting?");
    System.out.println("Your message contains the letter 'u' " + uCount + " times. Isn't that interesting?");
  }

  public static String Message() {
      Scanner keyboard = new Scanner(System.in);

      String message;

      System.out.print("Enter a word: ");
      message = keyboard.nextLine();

      return message;
  }
}
