public class AddingValues {
  public static void main(String[] args) {
    NumberLoop game = new NumberLoop();
    int number;

    game.setNumber();
    number = game.getNumber();

    game.AddLoop(number);
  }
}
