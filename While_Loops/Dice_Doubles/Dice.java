import java.util.Random;

public class Dice {
  private Random number = new Random();
  private int dice;

  private void RollDice() {dice = number.nextInt(6);}
  public int GetRoll(){ RollDice(); return dice;}
}
