import java.util.Random;
import java.util.List;
import java.util.Arrays;

public class Dealer {
  private Random random = new Random();
  private int number;

  public String getFaceCard() {
    List<String> faceCards = Arrays.asList("Jack", "Queen", "King");
    String selectCard = faceCards.get(random.nextInt(faceCards.size()));

    return selectCard;
  }

  public int setNumber(int max){number = random.nextInt(max); return number;}
}
