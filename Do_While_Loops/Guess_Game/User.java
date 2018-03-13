import java.util.Scanner;

public class User {
  Scanner input = new Scanner(System.in);

  int guess;

  public void setGuess() {System.out.print("Guess: "); guess = input.nextInt();}
  public int getGuess() {return guess;}
}
