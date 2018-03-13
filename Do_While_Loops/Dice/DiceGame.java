public class DiceGame {
  public static void main(String[] args) {
    Dice game = new Dice();

    int roll1, roll2;

    do {
      game.RollDice();
      roll1 = game.GetRoll();

      game.RollDice();
      roll2 = game.GetRoll();

      game.DiceLogic(roll1, roll2);
    } while (roll1 != roll2);

    System.out.println("Doubles!");
  }
}
