import java.util.Scanner;

public class Adventure {
  public void startGame() {
    String stringInput = "";
    int numberInput = 0;
    boolean proceed;

    System.out.println("Are you ready to play!");
    stringInput = userStringInput();
    stringInput = checkReady(stringInput);

    if (stringInput.equals("yes")) {
        System.out.println("Welcome to the Journey Of Reality!");
        System.out.println("You awaken in life suddenly realizing you have been wasting your time. ");
        System.out.println("Are you ready to make a change?");
        stringInput = userStringInput();
        stringInput = checkReady(stringInput);

        if (stringInput.equals("yes")) {
          System.out.println("Great that's the first step!");
          System.out.println("You know their is great potential within you, how will you unlock your greatest version?");
          System.out.println("    1) Deep Meditation");
          System.out.println("    2) Sacrifice");
          System.out.println("    3) I don't want to become my greatest version");
          numberInput = userIntInput();

          if (numberInput != 1 && numberInput != 2 && numberInput != 3) {
            System.out.println("I don't understand your answer");
            QuestionAndAnswers("You know their is great potential within you, how will you unlock your greatest version?",
                                  "Deep Meditation",
                                  "Sacrifice",
                                  "I don't want to become my greatest version");
            numberInput = userIntInput();
          }

          if (numberInput == 1) {
            DeepMeditation();
          } else if (numberInput == 2) {
            Sacrifice();
          } else if (numberInput == 3) {
            System.out.println("You will forever live in the matrix!");
          }
        }
      }
    }
  public void EndGameStory(String career) {
    System.out.println("You begin training relentlessly..");
    System.out.println("Giving up sleep");
    System.out.println("Giving up time");
    System.out.println("Giving up pleasure");
    System.out.println("Giving up the self");
    System.out.println("To become one with the divine...");
    callSleep();
    System.out.println("Through sacrifice and pain");
    System.out.println("through discipline....");
    callSleep();
    System.out.println("through doubt....");
    callSleep();
    System.out.println("through fear...");
    callSleep();
    System.out.println("through thiking you weren't good enough...");
    callSleep();
    System.out.println("through believing you couldn't make it....");
    callSleep();
    System.out.println("Comes consistency, day after day");
    callSleep();
    System.out.println("Hour after gruesome hour");
    callSleep();
    System.out.println("You push to the brink not knowing if you would survive");
    callSleep();
    System.out.println("not knowing if the day would ever come");
    callSleep();
    System.out.println("falling into complete darkness...");
    callSleep();
    System.out.println("comes a bright star, you've fought through all obstacles");
    callSleep();
    System.out.println("Congratulations Wise Disciple, you have awoken your mind, body and soul.");
    System.out.println("You achieve your goal of becoming a " + career);
    System.out.println("Your journey is complete. Thanks for playing");
  }
  public void DeepMeditation() {
    int numberInput = 0;
    System.out.println("Deep Meditation, a wise path to unlock your greatest version, You will endure lots of sacrifice to handle this transition.");
    callSleep();
    System.out.println("....6 months of dedicated meditation....");
    callSleep();
    System.out.println("While in deep meditiation one morning you suddenly visualize all things possible,");
    System.out.println("You begin to realize that you had the power all along, your mind has awoken.");
    QuestionAndAnswers("With this new found knowledge what do you choose to do?",
                          "Sacrifice",
                          "Forgive",
                          "Rejection");
    numberInput = userIntInput();
    if (numberInput != 1 && numberInput != 2 && numberInput != 3) {
      System.out.println("I don't understand your answer");
      QuestionAndAnswers("With this new found knowledge what do you choose to do?",
                            "Sacrifice",
                            "Forgive",
                            "Rejection");
    }

    if (numberInput == 1) {
      System.out.println("\nSacrifice begins with surrendering who you are, for who you need to become.");
      System.out.println("Through Deep Meditation you gained the willpower to cut out all distractions!");
      System.out.println("Giving up time consumers," +
                            "\nVideo Games" +
                            "\nSmoking Weed" +
                            "\nBeing lazy");
      callSleep();
      numberInput = EnlightnmentPath();

    } else if (numberInput == 2) {
        System.out.println("Forgiveness is powerful, learning to forgive it learning to grow");
        System.out.println("Through forgiveness you, forgive yourself for not accomplishing your goals");
        System.out.println("during this process you also learn that if you don't accomplish these goals");
        System.out.println("you simply will be forgiving yourself your whole life");
        System.out.println("You begin to grind hard");
        callSleep();
        numberInput = EnlightnmentPath();
      } else if (numberInput == 3) {
          System.out.println("Knowing the truth and choosing to still live life with the cover pulled over your eyes.");
          System.out.println("Surredering yourself to life, you hand over the keys and go on autopilot");
          callSleep();
          System.out.println("You allow life to guide you, and keep you surpressed");
          callSleep();
          System.out.println("You will forever live in the matrix, where the impossible remains impossible");
          callSleep();
          System.out.println("Your dreams are impossible, your goals are impossible.");
          callSleep();
          System.out.println("You are full of excuses, excuses that will hold you back for the rest of your life.");
      }
    }
  public void Sacrifice() {
    int numberInput = 0;
    System.out.println("Sacrifice, a noble way to unlock your greatest version. You will require lots of deep meditation to handle this transition.");
    System.out.println("You begin submitting yourself to pain");
    System.out.println("Pain is my friend, pain is the way to success");
    System.out.println("You need to give up anything not serving the vision you have imagined for yourself");
    System.out.println("To be great you must be willing to change your habits");
    System.out.println("You need to get better, in order to be where you want to be");
    System.out.println("and do what you want to do you need to sacrifice time");
    System.out.println("sacrifice comfort");
    System.out.println("sacrifice peace");
    QuestionAndAnswers("What are you willing to sacrifice?",
                          "Time",
                          "Pleasure",
                          "I can't sacrifice.");
    numberInput = userIntInput();
    if (numberInput != 1 && numberInput != 2 && numberInput != 3) {
        System.out.println("I don't understand your answer");
        QuestionAndAnswers("What are you willing to sacrifice?",
                              "Time",
                              "Pleasure",
                              "I can't sacrifice.");
    }

    if (numberInput == 1) {
        System.out.println("Buddha said, \"The problem is you think you have time.\"");
        callSleep();
        System.out.println("No more do you spend time wastefully.");
        callSleep();
        System.out.println("You learn to give up all things not serving you");
        callSleep();
        System.out.println("Every second of the day is calculated and planned out for success");
        numberInput = EnlightnmentPath();

    } else if (numberInput == 2) {
        System.out.println("You begin to give up all pleasurable habits that no longer suit you");
        System.out.println("Pleasure is no longer the path you seek");
        callSleep();
        System.out.println("You are not afraid of failure");
        callSleep();
        System.out.println("You are not afraid of pain");
        callSleep();
        System.out.println("What does not kill you, only makes you strong");
        numberInput = EnlightnmentPath();
    } else if (numberInput == 3) {
        System.out.println("If you can not sacrifice, then you can not grow.");
      }
  }
  public int EnlightnmentPath() {
    int numberInput = 0;
    System.out.println("\nYou have ascended to a higher state of consiousness & awareness");
    System.out.println("You no longer look a life the same");
    System.out.println("You give 110% into anything you put your mind to");
    System.out.println("And through the power of your journey your mind can get through anything.");

    QuestionAndAnswers("With this enlightnment will you",
                          "Become a Developer",
                          "Become a Physician",
                          "Follow the wave");
    numberInput = userIntInput();

    if (numberInput != 1 && numberInput != 2 && numberInput != 3) {
        System.out.println("I don't understand your answer");
        QuestionAndAnswers("With this enlightnment will you",
        "Become a Developer",
        "Become a Physician",
        "Follow the wave");
        numberInput = userIntInput();
      }

      if (numberInput == 1) {
        EndGameStory("Developer");
      } else if (numberInput == 2) {
        EndGameStory("Physician");
      } else if (numberInput == 3) {
        EndGameStory("Enlightned One");
      }
    return numberInput;
  }
  public void callSleep() {
    try {
      Thread.sleep(4000);
    } catch(InterruptedException e) {
      System.out.println("Caught");
    }
  }
  public void QuestionAndAnswers(String question, String option1, String option2, String option3) {
    System.out.println(question);
    System.out.println("  1) " + option1);
    System.out.println("  2) " + option2);
    System.out.println("  3) " + option3);
  }
  public String checkReady(String input) {
    boolean ready = false;

    if (input.equals("yes") || input.equals("no")) {
      ready = true;
      return input;
    }

    while (!ready) {
      System.out.println("I don't know what " + input + " means?");
      input = userStringInput();

      if (input.equals("yes") || input.equals("no")) {
        return input;
      }
    }
    return "";
  }
  public String userStringInput() {
    String input;
    User user = new User();
    user.setStringInput();
    input = user.getStringInput();

    return input;
  }
  public int userIntInput() {
    int input;
    User user = new User();
    user.setIntInput();
    input = user.getIntInput();

    return input;
  }
}
