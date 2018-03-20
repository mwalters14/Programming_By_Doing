import java.util.Scanner;
import java.util.Random;

public class Nim {
  public static void main(String[] args) {
    // localNim();
    AINim();
  }

  public static void localNim() {
    Random number = new Random();
    Scanner input = new Scanner(System.in);

    int pile1, pile2, pile3;
    int userInput, switcher;
    String player1, player2, name, pileChoice, pileHolder;

    pile1 = 1 + number.nextInt(6);
    pile2 = 1 + number.nextInt(6);
    pile3 = 1 + number.nextInt(6);

    System.out.print("Player1, Enter your name: ");
    player1 = input.next();

    System.out.print("Player2, Enter your name: ");
    player2 = input.next();


    switcher = 1;
    while (pile1 != 0 || pile2 != 0 || pile3 != 0) {
      System.out.println(" A: " + pile1 +
                        " B: " + pile2 +
                        " C: " + pile3 + "\n");

      if (switcher == 1) {
        name = player1;
      } else {
        name = player2;
      }

      System.out.print(name + " Choose a pile: ");
      pileChoice = input.next();

      System.out.print("Enter a number: ");
      userInput = input.nextInt();

      if (pileChoice.equals("A")) {
        pile1 = pile1 - userInput;
      } else if (pileChoice.equals("B")) {
        pile2 = pile2 - userInput;
      } else if ((pileChoice.equals("C"))) {
        pile3 = pile3 - userInput;
      }

      switcher *= -1;
    }

    if (switcher == 1) {
      System.out.println(player2 + " you emptied the last pile!");
      System.out.println(player1 + " there are no piles left, you win!");
    } else {
      System.out.println(player1 + " you emptied the last pile!");
      System.out.println(player2 + " there are no piles left, you win!");
    }
  }

  public static void AINim() {
    Random number = new Random();
    Scanner input = new Scanner(System.in);

    int pile1, pile2, pile3;
    int userInput, switcher;
    String player1, player2, name, pileChoice, pileHolder;

    pile1 = 1 + number.nextInt(6);
    pile2 = 1 + number.nextInt(6);
    pile3 = 1 + number.nextInt(6);

    System.out.print("Player1, Enter your name: ");
    player1 = input.next();
    player2 = "The unstoppable AI";


    switcher = 1;
    while (pile1 != 0 || pile2 != 0 || pile3 != 0) {
      System.out.println(" \nA: " + pile1 +
                        " B: " + pile2 +
                        " C: " + pile3 + "\n");

      if (switcher == 1) {
        name = player1;
      } else {
        name = player2;
      }

      if (pile1 == 1 && pile2 == 0 && pile3 == 0 || pile1 == 0 && pile2 == 1 && pile3 == 0 || pile1 == 0 && pile2 == 0 && pile3 == 1) {
        switcher *= -1;
        System.out.println(name + " you are forced to take the last pile \n");
        break;
      }

      System.out.print(name + " Choose a pile: ");
      pileChoice = input.next();

      while (!pileChoice.equals("A") && !pileChoice.equals("B") && !pileChoice.equals("C")) {
        System.out.print("That pile is not an option. Choose a pile: ");
        pileChoice = input.next();
      }

      while ((pileChoice.equals("A") && pile1 <=0)||(pileChoice.equals("B") && pile2 <=0)||(pileChoice.equals("C") && pile3 <=0)){
				System.out.print("Nice try, " + name + ". That pile is empty. Choose again: ");
				pileChoice = input.next();
			}

      System.out.print("Enter a number: ");
      userInput = input.nextInt();

      while (userInput < 1) {
        System.out.print("Number must be at least 1: ");
        userInput = input.nextInt();
      }


      while ((pileChoice.equals("A") && (pile1 - userInput) < 0)||(pileChoice.equals("B") && (pile2 - userInput) < 0)||(pileChoice.equals("C") && (pile3 - userInput) < 0)){
        System.out.print("Pile " + pileChoice + " doesn't have that many try again. ");
        userInput = input.nextInt();
      }

      if (pileChoice.equals("A")) {
          pile1 = pile1 - userInput;
        } else if (pileChoice.equals("B")) {
            pile2 = pile2 - userInput;
        } else if ((pileChoice.equals("C"))) {
            pile3 = pile3 - userInput;
        }

    switcher *= -1;
  }
    if (switcher == 1) {
      System.out.println(player1 + " there are no piles left, you win!");
    } else {
      System.out.println(player2 + " there are no piles left, you win!");
    }
  }
}
