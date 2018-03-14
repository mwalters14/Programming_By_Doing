public class Collatz {
  public static void main(String[] args) {
    User user = new User();
    int number;
    int result = 0;
    int count = 0;

    user.setNumber();
    number = user.getNumber();
    int highestNum = number;
    System.out.print(number + "   ");

    if (number % 2 == 0) {
      result = number / 2;
    } else {
      result = (3 * number) + 1;
    }
    System.out.print(result + "   ");
    count++;

    do {
      if (result % 2 == 0) {
        result = result / 2;
        System.out.print(result + "   ");
        if (highestNum < result) {
          highestNum = result;
        }
      } else {
        result = (3 * result) + 1;
        System.out.print(result + "   ");
        if (highestNum < result) {
          highestNum = result;
        }
      }
      count++;
    } while (result != 1);
    System.out.println("\nIt took " + count + " iterations to get to 1");
    System.out.println("The highest number was " + highestNum);
  }
}
