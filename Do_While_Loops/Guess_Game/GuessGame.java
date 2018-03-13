public class GuessGame {
  public static void main(String[] args) {
      RandomNumber randGenerator = new RandomNumber();
      User user = new User();

      int randNum, userGuess;
      int tries = 0;


      randGenerator.setRand();
      randNum = randGenerator.getRand();
      System.out.println("I have chosen a number between 1 -10 this guess determines your life.");
      System.out.println("Choose wisely");

      do {
          user.setGuess();
          tries++;

          userGuess = user.getGuess();

          if (userGuess != randNum) {
            System.out.println("Incorrect, Try Again.");
          }
      } while (userGuess!= randNum);
      System.out.println("That's right! It was " + randNum);
      System.out.println("It took you " + tries + " tries.");
  }
}
