import java.util.Random;

public class Magic8Ball {
  public static void main(String[] args) {
    Random number = new Random();

    int i = 1 + number.nextInt(20);
    String response = "";

    if (i == 1) {
      response = "It is certain";
    } else if (i == 2) {
      response = "It is decidedly so";
    } else if (i == 3) {
      response = "Without a doubt";
    } else if (i == 4) {
      response = "Yeah";
    } else if (i == 5) {
      response = "Yes - definitely";
    } else if (i == 6) {
      response = "You may rely on it";
    } else if (i == 7) {
      response = "As I see it, yes!";
    } else if (i == 8) {
      response = "Probably";
    } else if (i == 9) {
      response = "Most likely";
    } else if (i == 10) {
      response = "Outlook is good";
    } else if (i ==11) {
      response = "Yikes!";
    } else if (i == 12) {
      response = "Not looking to hot";
    } else if (i == 13) {
      response = "Bad";
    } else if (i == 14) {
      response = "Horrible";
    } else if (i == 15) {
      response = "Turn back now";
    } else if (i == 16) {
      response = "You won't make it";
    } else if (i == 17) {
      response = "Your not good enough";
    } else if (i == 18) {
      response = "Success people are not born";
    } else if (i == 19) {
      response = "They are made";
    } else if (i == 20) {
      response = "Day after day";
    }

    System.out.println(response);
  }
}
