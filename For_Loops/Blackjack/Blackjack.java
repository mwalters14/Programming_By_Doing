public class Blackjack {
  public static void main(String[] args) {
    User user = new User();
    Dealer dealer = new Dealer();


    String input, face;
    int playerDraw1, playerDraw2;
    int dealerDraw1, dealerDraw2;
    int playerTotal, dealerTotal;
    int maxDraw = 11;
    boolean game = true;

    while (game) {
      playerDraw1 = dealer.setNumber(maxDraw);
      playerDraw2 = dealer.setNumber(maxDraw);
      dealerDraw1 = dealer.setNumber(maxDraw);
      dealerDraw2 = dealer.setNumber(maxDraw);

      playerTotal = playerDraw1 + playerDraw2;
      dealerTotal = dealerDraw1 + dealerDraw2;


      String selectCard = dealer.getFaceCard();

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
      System.out.println("\nWould you like to play again?");
      String userBool = user.setInput();
      if (userBool.equalsIgnoreCase("no") ) {
        System.out.println("Thanks for playing!");
        game = false;
        break;
      } else if (userBool.equalsIgnoreCase("yes")) {
      } else {
        System.out.println("I did not understand your input");
        System.out.println("\nWould you like to play again?");
        userBool = user.setInput();
      }
    }
  }
}
