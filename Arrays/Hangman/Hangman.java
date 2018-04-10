import java.util.*;
120
public class Hangman {
  public static void main(String[] args) {
    Random random = new Random();
    String[] word_list = {"computation","ornamental","tenuous", "decisive","squalid","adhesive","nebulous"};

    int number = random.nextInt(word_list.length);
    String choosenWord = word_list[number];

    char[] word_array = array_builder(choosenWord);
    char[] blank_array = new char[word_array.length];
    blank_array = blank_OutArray(blank_array);

    /*
      Testing Purposes
      // compare_arrays(word_array, blank_array);
      // display_word(word_array);
    */

    int guesses = 0;
    int max_guesses = 12;

    guess_letter(guesses, max_guesses, blank_array, word_array);

  }

  public static void guess_letter(int guesses, int max_guesses, char[] blank_array, char[] word_array) {
    char guess = '\u0000';
    char[] misses = new char[max_guesses];
    misses = blank_OutArray(misses);
    int miss = 0;
    while (find_blanks(blank_array) && guesses < max_guesses) {
      System.out.println("=-=-=-=-=-=-=-=-=-=-=");
      display_array(blank_array);
      System.out.println();
      guess = user_guess();
      guesses++;

      boolean found = false;
      for (int i = 0; i < blank_array.length; i++ ) {
        if (guess == word_array[i]) {
          found = true;
          if (blank_array[i] == '\u0000') {
            blank_array[i] = word_array[i];
          }
        }
      }

      if (!found) {
        if (misses[miss] == '\u0000') {
            misses[miss] = guess;
          }
          miss++;
          display_misses(misses);
        }
      }
    check_ifWinner(guesses,max_guesses,blank_array,word_array);
  }

  public static char[] add_toMisses(char guess, char[] misses, int miss, int max_guesses) {
    misses[miss] = guess;
    return misses;
  }
  public static void check_ifWinner(int guesses, int max_guesses, char[] blank_array, char[] word_array) {
    if (guesses < max_guesses) {
      display_array(blank_array);
      System.out.println("\nYou won!");
    } else {
      display_array(blank_array);
      System.out.println("\nSorry! You ran out of guesses :(");
      System.out.print("The word was ");
      display_word(word_array);
      System.out.println();
      System.out.println("You lose, try again next time!");
    }
  }

  public static char[] blank_OutArray(char[] word_array) {
    char[] blank = new char[word_array.length];
    for(int i =0; i < blank.length; i++) {
      blank[i] = '\u0000';
    }
    return blank;
  }

  public static boolean find_blanks(char[] word_array) {
    boolean blank_found = false;
    for (int i = 0; i < word_array.length; i++ ) {
      if (word_array[i] == '\u0000') {
        blank_found = true;
      }
    }
    return blank_found;
  }

  // For testing.
  public static void compare_arrays(char[] array1, char[] array2) {
    System.out.print("Array 1: ");
    for (int i = 0; i < array1.length ; i++) {
      System.out.print(array1[i] + " ");
    }
    System.out.println("");
    System.out.println("----------------------------");

    System.out.print("Array 2: ");
    for (int i = 0; i < array2.length ; i++) {
      if (array2[i] == '\u0000') {
        System.out.print("_" + " ");
      } else {
          System.out.print(array2[i] + " ");
      }
    }
    System.out.println();
  }

  public static void display_misses(char[] misses) {
    System.out.println();
    System.out.print("Misses: ");
    for (int e = 0; e < misses.length ; e++) {
        System.out.print(misses[e]);
    }
    System.out.println();
  }
  public static void display_array(char[] array) {
    System.out.print("\nWord: ");
    for (int i = 0; i < array.length ; i++ ) {
      if (array[i] == '\u0000') {
        System.out.print("_" + " ");
      } else {
          System.out.print(array[i] + " ");
      }
    }
    System.out.println("");
  }

  public static char[] copy_array(char[] original) {
    char[] clone = new char[original.length];
    System.arraycopy( original, 0, clone, 0, original.length);
    return clone;
  }

  public static void display_word(char[] array) {
    for (int i = 0; i < array.length ; i++ ) {
      if (array[i] == ' ') {
        System.out.print("_" + " ");
      } else {
        System.out.print(array[i]);
      }
    }
  }

  public static char[] array_builder(String word) {
    char [] char_array = new char[word.length()];
    for (int i = 0; i < word.length() ;i++ ) {
      char_array[i] = word.charAt(i);
    }
    return char_array;
  }

  public static char user_guess() {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Guess: ");
    char guess = keyboard.next().charAt(0);
    return guess;
  }
}
