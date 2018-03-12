import java.util.Random;
import java.util.Scanner;

public class FortuneCookie {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random number = new Random();

    int randomFortune, rand1, rand2, rand3, rand4, rand5, rand6;
    String fortune = "";

    randomFortune = 1 + number.nextInt(6);

    if (randomFortune == 1) {
      fortune = "You will need to sacrifice, in order to obtain your dreams";
    } else if (randomFortune == 2) {
        fortune = "In order to become your greatest version, you must give up your weakest qualities.";
    } else if (randomFortune == 3) {
        fortune = "We are made by our habits";
    } else if (randomFortune == 4) {
        fortune = "I will code everyday, hour after hour. Until I am master.";
    } else if (randomFortune == 5) {
        fortune = "Don't doubt anyone, everyone has the potential for greatness.";
    } else if (randomFortune == 6) {
        fortune = "You have awoken the sleeping giant.";
    }

    System.out.println(fortune);
    // Random lotto
    rand1 = 1 + number.nextInt(54);
    rand2 = 1 + number.nextInt(54);
    rand3 = 1 + number.nextInt(54);
    rand4 = 1 + number.nextInt(54);
    rand5 = 1 + number.nextInt(54);
    rand6 = 1 + number.nextInt(54);

    System.out.println(rand1 + " - " + rand2 + " - " + rand3 + " - " + rand4 + " - " + rand5 + " - " + rand6 );
  }
}
