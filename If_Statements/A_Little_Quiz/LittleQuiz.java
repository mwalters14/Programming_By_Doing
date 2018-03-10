import java.util.Scanner;

public class LittleQuiz{
  public static void AskQuestion(String question) {
    System.out.println(question);
  }

  public static void ListAnswers(String answers) {
    System.out.println(answers);
  }

  public static void Correct() {
    System.out.println("Thats right! \n");
  }

  public static boolean checkAnswer(int correctAnswer, int userInput) {
    boolean result = false;
    if (userInput == correctAnswer) {
      Correct();
      result = true;
    } else {
      System.out.println("That's incorrect \n");
    }
    return result;
  }



  public static int getUserInput() {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Answer: ");
    int userInput = keyboard.nextInt();

    return userInput;
  }

  public static void main(String[] args) {
    int correctAnswers = 0;
    int answer;

    AskQuestion("Q1: What language is being used for this program ");
    ListAnswers("     1) Python");
    ListAnswers("     2) Java");
    ListAnswers("     3) C++");
    answer = getUserInput();

    if (checkAnswer(2,answer)) {
        correctAnswers++;
    }


    AskQuestion("Q2: Which job position writes code ");
    ListAnswers("     1) Rapper");
    ListAnswers("     2) Garbage Man");
    ListAnswers("     3) Developer");
    answer = getUserInput();

    if(checkAnswer(3, answer)) {
        correctAnswers++;
    }

    AskQuestion("Q3: Which fruit is orange in color? ");
    ListAnswers("     1) Orange");
    ListAnswers("     2) Pear");
    ListAnswers("     3) Apple");
    answer = getUserInput();

    if (checkAnswer(1, answer)) {
      correctAnswers++;
    }

    System.out.println("Overall you got " + correctAnswers + " out of 3 correct");
    System.out.println("Thanks for playing");
  }
}
