public class GuessGame {
  public static void main(String[] args) {
    User user = new User();

    int correctNum, userGuess;
    user.setRandomNum();
    correctNum = user.getRandomNum();

    System.out.print("Bet you can't guess what number I'm thinking of? ");
    user.setGuessNum();
    userGuess = user.getGuess();

    while (userGuess != correctNum) {
      System.out.print("Incorrect! I knew you couldn't guess my number. Try again.");
      System.out.print("What number am I thinking of? ");
      user.setGuessNum();
      userGuess = user.getGuess();
    }

    System.out.println("You got it! Congrats! It was " + correctNum);
  }
}
