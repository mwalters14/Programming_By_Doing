import java.util.Random;

public class Dice {
  Random number = new Random();

  int dice;

  public void RollDice() {dice = number.nextInt(6);}
  public int GetRoll(){return dice;}
  public void DiceLogic(int roll1, int roll2) {
    int total = 0;

    System.out.println("Roll #1: " + roll2);
    System.out.println("Roll #2: " + roll1);
    total = total + roll1 + roll2;
    System.out.println("Your total is: " + total + "\n");
    }
}
