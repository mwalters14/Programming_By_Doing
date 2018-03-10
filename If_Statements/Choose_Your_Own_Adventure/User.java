import java.util.Scanner;

public class User {
  private String input;
  private int number;

  Scanner keyboard = new Scanner(System.in);

  public void setStringInput(){input = keyboard.next();}
  public void setIntInput(){number = keyboard.nextInt();}
  public String getStringInput() {return input;}
  public int getIntInput() {return number;}

}
