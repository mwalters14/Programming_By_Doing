public class DiceDoubles {
  public static void main(String[] args) {
    Dice dice = new Dice();
    int roll1, roll2, total;

    roll1 = dice.GetRoll();
    roll2 = dice.GetRoll();
    total = roll1 + roll2;

    System.out.println("Roll #1: " + roll1);
    System.out.println("Roll #2: " + roll2);
    System.out.println("Total: " + total + "\n");

    while (roll1 != roll2) {
      roll1 = dice.GetRoll();
      roll2 = dice.GetRoll();

      System.out.println("Roll #1: " + roll1);
      System.out.println("Roll #2: " + roll2);
      System.out.println("Total: " + total + "\n");
    }

    System.out.println("Doubles!!");
  }
}
