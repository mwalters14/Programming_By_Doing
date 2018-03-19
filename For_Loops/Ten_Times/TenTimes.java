// Create a for loop that prints a message 10 times
public class TenTimes {
  public static void main(String[] args) {
    TenTimes("Hello World, this is cool", 10);
  }

  public static void TenTimes(String message, int times) {
    for (int i = 0; i <= times; i++ ) {
      System.out.println(message);
    }
  }
}
