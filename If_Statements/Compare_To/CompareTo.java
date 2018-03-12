import java.util.Scanner;

public class CompareTo{
  public static void main(String[] args) {
    // Less than 0
    StaticCompareString("axe","wheel");
    StaticCompareString("marijuana","weed");
    StaticCompareString("I","will");
    StaticCompareString("I","don't");
    StaticCompareString("I","live for it");
    StaticCompareString("kindness","patience");
    StaticCompareString("discipline","self-control");
    StaticCompareString("buddha","meditation");
    StaticCompareString("life","prana");
    StaticCompareString("self","yoga");
    StaticCompareString("doubt","fear");

    // Greater than 0
    StaticCompareString("fear","failure");
    StaticCompareString("goals","dreams");
    StaticCompareString("not","fail");
    StaticCompareString("reality","matrix");
    StaticCompareString("work","ethic");
    StaticCompareString("loving","caring");
    StaticCompareString("popcorn","dragon");
    StaticCompareString("clarity","clairvoyance");

    // Equal to 0
    StaticCompareString("zero","zero");
    StaticCompareString("star","star");
}

  public static void compareString(String compareWord, String compareWord2) {
    System.out.println("Comparing " + "\"" + compareWord + "\"" + " with \"" + compareWord2 + "\"" + " produces");
    int i = compareWord.compareTo(compareWord2);

    System.out.println(i);
  }

  public static void StaticCompareString(String compareWord, String compareWord2) {
    compareString(compareWord, compareWord2);
  }

  public static void UserCompareString() {
    Scanner keyboard = new Scanner(System.in);

    String word1, word2;

    System.out.print("Enter a word: ");
    word1 = keyboard.next();

    System.out.print("Enter a second word: ");
    word2 = keyboard.next();

    compareString(word1,word2);
  }
}
