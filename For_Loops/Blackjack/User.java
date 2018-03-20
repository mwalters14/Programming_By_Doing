import java.util.Scanner;

public class User {
  Scanner keyboard = new Scanner(System.in);
  String input;

  public String setInput() {input = keyboard.next(); return input;}
}
