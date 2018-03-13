import java.util.Scanner;

public class User {
  Scanner input = new Scanner(System.in);

  int number;

  public void setNumber() {System.out.print("Enter a number: "); number = input.nextInt();}
  public int getNumber() {return number;}
}
