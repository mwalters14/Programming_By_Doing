public class RightTriangle {
  public static void main(String[] args) {
    User user = new User();
    int num1, num2, num3;
    double sq1, sq2, sq3;

    user.setNumber();
    num1 = user.getNumber();

    do {
      user.setNumber();
      num2 = user.getNumber();
    } while (num2 < num1);

    do {
        user.setNumber();
        num3 = user.getNumber();
    } while (num3 < num1 || num3 < num2);

      System.out.println("Applying Pythagorean theorem");
      sq1 = Math.pow(num1, 2);
      sq2 = Math.pow(num2, 2);
      sq3 = Math.pow(num3, 2);

      double total = sq1 + sq2;


      if (total == sq3) {
        System.out.println("This is a right triangle.");
      } else {
        System.out.println("No, it's not a right triangle.");
      }
  }
}
