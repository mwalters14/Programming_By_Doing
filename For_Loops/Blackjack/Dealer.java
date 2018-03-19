import java.util.Random;

public class Dealer {
  private Random random = new Random();
  private int number;

  public int setNumber(int max){number = random.nextInt(max); return number;}
}
