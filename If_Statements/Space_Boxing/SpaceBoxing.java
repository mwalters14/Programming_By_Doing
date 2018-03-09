import java.util.Scanner;

public class SpaceBoxing{
  public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);

      String planet = "";
      int weight, planetChoice;
      double planetWeight = 0.0;

      System.out.print("Please enter your current earth weight: ");
      weight = keyboard.nextInt();

      System.out.println("I have information on the following planets:");
      System.out.println("1. Venus   2. Mars    3. Jupiter");
      System.out.println("4. Saturn  5. Uranus  6. Neptune");

      System.out.print("Which planet are you visiting? ");
      planetChoice = keyboard.nextInt();

      if (planetChoice == 1) {
        planetWeight = weight * 0.78;
        planet = "Venus";
      } else if (planetChoice == 2) {
        planetWeight = weight * 0.39;
        planet = "Mars";
      } else if (planetChoice == 3) {
        planetWeight = weight * 2.65;
        planet = "Jupiter";
      } else if (planetChoice == 4) {
        planetWeight = weight * 1.17;
        planet = "Saturn";
      } else if (planetChoice == 5) {
        planetWeight = weight * 1.05;
        planet = "Uranus";
      } else if (planetChoice == 6) {
        planetWeight = weight * 1.23;
        planet = "Neptune";
      } else {
        System.out.println("Invalid planet choice");
      }

      System.out.println("Your weight would be " + planetWeight + " on " + planet);
  }
}
