import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HighScore {
  static Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {
    high_score();
  }

  public static void high_score() {
    int score = 0;
    String name;

    System.out.println("You got a high score!");
    try {
      PrintWriter writer = new PrintWriter(new FileWriter("C:\\Programming_By_Doing\\File_Input_And_Output\\High_Score\\highscore.txt"));
      System.out.print("\nPlease enter your score: ");
      score = get_score();
      writer.println("Score: " + score);

      System.out.print("Please enter your name: ");
      name = get_name();
      writer.println("Name: " + name);

      writer.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    System.out.println("Data stored into highscore.txt");
  }

  public static int get_score() {
    int score = keyboard.nextInt();
    return score;
  }
  public static String get_name() {
      String name = keyboard.next();
      return name;
  }
}
