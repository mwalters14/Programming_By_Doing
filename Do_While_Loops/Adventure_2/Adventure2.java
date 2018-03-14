import java.util.Scanner;

public class Adventure2 {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int nextroom = 1;

      String userInput;
      System.out.println("Myron's tiny adventure! *Dun da da duuuun*");

      while (nextroom != 0) {
        if (nextroom == 1) {
          System.out.println("You are at your desk, would you like to go the 'kitchen' or 'bathroom'");
          userInput = input.nextLine();

          if (userInput.equals("kitchen")) {
            nextroom = 2;
          } else if (userInput.equals("bathroom")) {
            nextroom = 3;
          }
        }

        if (nextroom == 2) {
          System.out.println("You enter the kitchen, you notice the refrigerator door is open");
          System.out.println("Do you 'close it', 'ignore it'");
          userInput = input.nextLine();

          if (userInput.equals("close it")) {
            System.out.println("You approach the fridge, as you get closer you begin to get a bad feeling about this");
            System.out.println("You convince yourself your just stoned and pursue on, suddenly you realize it feels like you've been walking towards this thing for 5 minutes now and haven't moved");
            System.out.println("Wow you think, I must really be stoned");
            System.out.println("Would you like to turn back");
            userInput = input.nextLine();

            if (userInput.equals("turn back")) {
              System.out.println("You turn back only to see that your no longer in your office.");
              System.out.println("Behind you.....is the same refrigerator");
              System.out.println("You quickly turn back around...the same refrigerator");
              System.out.println("Your stuck in an endless loop of walking to the refrigerator");
              nextroom = 0;
            }
          } else if (userInput.equals("ignore it")) {
            System.out.println("You turn around realizing you didn't need anything in the kitchen.");
            nextroom = 1;
          }
        } else if (nextroom == 3) {
          System.out.println("You enter the bathroom, it smells really weird.");
          System.out.println("You notice behind one stall a bright glow");
          System.out.println("Do you 'explore' or 'leave (get the fk outta dodge)'");
          userInput = input.nextLine();
          if (userInput.equals("explore")) {
            System.out.println("You approach the stall, you slowly open the door");
            System.out.println("The toliet water is spinning rapidly, the water looks like a rainbow");
            System.out.println("The water looks hypnotizing, and peaceful. You inch closer watching all the");
            System.out.println("Spinning colors, when suddenly..");
            nextroom = 0;

          } else if (userInput.equals("leave")) {
            System.out.println("You turn around not messing with any nonsense, you don't get paid enough to go dora the explorer.");
            nextroom = 1;
          }
        }
      }
  }
}
