public class SquareRoot {
  public static void main(String[] args) {
    User user = new User();

    int number;

    do {
      user.setNumber();
      number = user.getNumber();

      if (number < 0) {
        System.out.println("I don't accept negative numbers.");
      }
    } while (number < 0);
    System.out.println("Square root of " + number + " is " + Math.sqrt(number));
  }
}
