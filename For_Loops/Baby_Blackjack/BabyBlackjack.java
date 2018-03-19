import java.util.Random;

public class BabyBlackjack {
  public static void main(String[] args) {
    Start();
  }

  public static void Start() {
    totals();
  }

  public static void totals() {
    int playerTotal, dealerTotal;
    int playerdraw1, playerdraw2;
    int dealerdraw1, dealerdraw2;

    playerdraw1 = getNumber();
    playerdraw2 = getNumber();
    dealerdraw1 = getNumber();
    dealerdraw2 = getNumber();

    playerTotal = playerdraw1 + playerdraw2;
    dealerTotal = dealerdraw1 + dealerdraw2;

    System.out.println("You drew " + playerdraw1 + " and " + playerdraw2);
    System.out.println("Your total is " + playerTotal);

    System.out.println("\nThe dealer drew " + dealerdraw1 + " and " + dealerdraw2);
    System.out.println("The dealer total is " + dealerTotal);

    if (playerTotal > dealerTotal) {
      System.out.println("\nYou WIN!");
    } else {
      System.out.println("\nThe dealer wins!");
    }
  }
  public static int getNumber() {
    Random random = new Random();
    int number;

    number = 1 + random.nextInt(10);
    return number;
  }
}
