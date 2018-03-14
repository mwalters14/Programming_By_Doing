import java.util.Scanner;

public class User {
  Scanner input = new Scanner(System.in);

  private int number;

  public void setNumber(){System.out.print("Starting number: "); number = input.nextInt();}
  public int getNumber(){return number;}
}
