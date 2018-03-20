import java.util.Random;
<<<<<<< HEAD
import java.util.Scanner;

public class Blackjack {
  public static void main(String[] args) {
    int playerDraw1, playerDraw2, dealerDraw1, dealerDraw2, playerTotal, dealerTotal, number, userBet, dealerBet, userWager, dealerWager;

    boolean game = true;

    while (game) {
      playerDraw1 = getNumber(10);
      playerDraw2 = getNumber(10);
      dealerDraw1 = getNumber(10);
      dealerDraw2 = getNumber(10);

      userBet = getNumber(100);
      dealerBet = getNumber(100);
      dealerWager = getNumber(dealerBet);

      System.out.println("You have " + userBet + "$ to wager");
      System.out.print("How much would you like to wager: ");
      userWager = getInputNumber();

      while (userWager > userBet) {
        System.out.println("\nYou don't have enough to wager");
        System.out.println("\nYou have " + userBet + "$ to wager");
        System.out.print("How much would you like to wager: ");
        userWager = getInputNumber();
      }

      System.out.println("You wager " + userWager + "$'s'");
      System.out.println("\nThe dealer wagers " + dealerWager + "$");

      playerTotal = playerDraw1 + playerDraw2;
      dealerTotal = dealerDraw1 + dealerDraw2;

      System.out.println("\nYou draw a " + playerDraw1 + " and " + playerDraw2);
      System.out.println("Your total is " + playerTotal);

      System.out.println("\nThe dealer has a " + dealerDraw1 + " showing, and a hidden card.");
      System.out.println("His total is hidden to. \n");

      System.out.println("Would you like to hit or stay?");
      String userInput = getInput();

      while (!userInput.equals("stay")) {
        if (userInput.equals("hit")) {
          number  = getNumber(10);
          playerTotal += number;

          System.out.println("You drew " + number);
          System.out.println("Your total is " + playerTotal);

          if (playerTotal > 21) {
            System.out.println("You bust! Dealer wins!");
            break;
          }
          System.out.println("Would you like to hit or stay?");
          userInput = getInput();
        } else {
          System.out.println("\nI don't understand your input");
          System.out.println("Would you like to hit or stay?");
          userInput = getInput();
        }
      }

      if (playerTotal <= 21) {
          System.out.println("\nOkay, dealer's turn");
          System.out.println("\nThe dealer reveals his hidden card, it's a " +  dealerDraw2);
          System.out.println("The dealer total is " + dealerTotal);

          while (dealerTotal < 16) {
            number = getNumber(10);
            dealerTotal += number;

            System.out.println("\nDealer chooses to hit.");
            System.out.println("He draws a " + number);
            System.out.println("His total is " + dealerTotal);

            if (dealerTotal > 21) {
              System.out.println("Dealer bust!");
              System.out.println("Player wins!");
              break;
            }
          }

          if (dealerTotal <= 21) {
            System.out.println("\nDealer stays");
            System.out.println("\nDealer total is " + dealerTotal);
            System.out.println("Your total is " + playerTotal);

            if (dealerTotal > playerTotal) {
              System.out.println("\nThe dealer wins!");
            } else if (dealerTotal == playerTotal) {
              System.out.println("It's a tie!");
            } else {
              System.out.println("\nPlayer Wins!");
            }
          }
        }
        System.out.println("\nWould you like to play again?");
        String userBool = getInput();
        if (userBool.equalsIgnoreCase("no") ) {
          System.out.println("Thanks for playing!");
          break;
        } else if (userBool.equalsIgnoreCase("yes")) {
        } else {
          System.out.println("I did not understand your input");
          System.out.println("\nWould you like to play again?");
          userBool = getInput();
        }
      }
    }


  public static int getNumber(int maxRandom) {
    Random random = new Random();

    int number;

    number = 1 + random.nextInt(maxRandom);
    return number;
  }

  public static String getInput() {
    Scanner keyboard = new Scanner(System.in);

    String input;

    input = keyboard.nextLine();
    return input;
  }

  public static int getInputNumber() {
    Scanner keyboard = new Scanner(System.in);

    int numberInput;

    numberInput = keyboard.nextInt();
    return numberInput;
=======
import java.util.List;
import java.util.Arrays;

public class Blackjack {
  public static void main(String[] args) {
    User user = new User();
    Dealer dealer = new Dealer();
    Random random = new Random();

    String input, face;
    int playerDraw1, playerDraw2;
    int dealerDraw1, dealerDraw2;
    int playerTotal, dealerTotal;
    int maxDraw = 11;

    playerDraw1 = dealer.setNumber(maxDraw);
    playerDraw2 = dealer.setNumber(maxDraw);
    dealerDraw1 = dealer.setNumber(maxDraw);
    dealerDraw2 = dealer.setNumber(maxDraw);

    playerTotal = playerDraw1 + playerDraw2;
    dealerTotal = dealerDraw1 + dealerDraw2;

    List<String> faceCards = Arrays.asList("Jack", "Queen", "King");
    String selectCard = faceCards.get(random.nextInt(faceCards.size()));

    if (playerDraw1 == 10 && playerDraw2 == 10 ) {
      System.out.println("You draw " + selectCard + " and a " + selectCard);
    } else if (playerDraw1 == 10) {
      System.out.println("You draw a " + selectCard + " and a " + playerDraw2);
    } else if (playerDraw2 == 10) {
      System.out.println("You draw a " + playerDraw1 + " and a " + selectCard);
    } else {
        System.out.println("You draw " + playerDraw1 + " and a " + playerDraw2);
    }

    System.out.println("Your total is " + playerTotal);

    if (dealerDraw1 == 10) {
      System.out.println("\nThe dealer draws " + selectCard + " and a hidden card");
    } else {
        System.out.println("\nThe dealer draws " + dealerDraw1 + " and a hidden card.");
    }
    System.out.println("The dealer total is hidden as well.");

    System.out.println("\nWanna hit or stay?");
    input = user.setInput();

    while (!input.equals("stay")) {
      if (input.equals("hit")) {
        playerDraw1 = dealer.setNumber(maxDraw);
        if (playerDraw1 == 10) {
          System.out.println("You draw a " + selectCard);
        } else {
          System.out.println("You draw a " + playerDraw1);
        }

        playerTotal += playerDraw1;
        System.out.println("Your total is " + playerTotal);

        if (playerTotal <= 21) {
          System.out.println("\nWanna hit or stay?");
          input = user.setInput();
        } else {
          System.out.println("You bust! The dealer wins.");
          break;
        }
      } else {
        System.out.println("\nI don't understand your input.");
        System.out.println("\nWanna hit or stay?");
        input = user.setInput();
      }
    }

    if (playerTotal <= 21) {
      if (dealerDraw2 == 10) {
        System.out.println("The dealer shows the hidden card, it's a " + selectCard);
      } else {
          System.out.println("The dealer shows the hidden card, it's a " + dealerDraw2);
      }
      System.out.println("His total is " + dealerTotal);

      while (dealerTotal <= 16) {
        System.out.println("\nThe dealer decides to hit.");
        dealerDraw1 = dealer.setNumber(maxDraw);
        if (dealerDraw1 == 10) {
          System.out.println("He draws a " + selectCard);
        } else {
            System.out.println("He draws a " + dealerDraw1 );
        }
        dealerTotal += dealerDraw1;
        System.out.println("His total is " + dealerTotal);
      }
      
      if (dealerTotal > 21) {
        System.out.println("The dealer bust! You win!");
      } else {
        if (playerTotal > dealerTotal) {
          System.out.println("You win!");
        } else if (playerTotal == dealerTotal) {
          System.out.println("It's a draw!");
        } else {
          System.out.println("The dealer wins!");
        }
      }
    }
>>>>>>> 1d2594556ce1d0954a885b67c87321901db12404
  }
}
