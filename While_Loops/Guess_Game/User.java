import java.util.Scanner;
import java.util.Random;

public class User {
  Scanner input = new Scanner(System.in);
  Random number = new Random();

  private int guess = 0;
  private int randomNum = 0;




  public void setRandomNum(){randomNum = 1 + number.nextInt(10);}
  public void setGuessNum(){guess = input.nextInt();}
  public int getRandomNum(){return randomNum;}
  public int getGuess(){return guess;}
}
