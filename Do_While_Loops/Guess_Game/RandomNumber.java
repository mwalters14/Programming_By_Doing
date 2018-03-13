import java.util.Random;

public class RandomNumber {
  Random random = new Random();

  int number;

  public void setRand() {number = 1 + random.nextInt(10);}
  public int getRand(){return number;}
}
