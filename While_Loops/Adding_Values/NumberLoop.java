import java.util.Scanner;

public class NumberLoop {
  Scanner input = new Scanner(System.in);

  int number;

  public void setNumber(){System.out.print("Enter a number: "); number = input.nextInt();}
  public int getNumber(){return number;}

  public void AddLoop(int number) {
    int total = 0;

    while (number != 0) {
      total = total + number;
      System.out.println("The total so far is " + total);

      setNumber();
      number = getNumber();
    }

    System.out.println("Your total is: " + total);
  }
}
