public class Evenness {
  public static void main(String[] args) {
    for (int i = 0; i <= 20 ; i++ ) {
      if (isEven.isEven(i) && isDivisibleBy3.isDivisibleBy3(i)) {
        System.out.println(i + " <=");
      } else if (isEven.isEven(i)) {
        System.out.println(i + " <");
      } else if (isDivisibleBy3.isDivisibleBy3(i)) {
        System.out.println(i + " =");
      } else {
        System.out.println(i);
      }
    }
  }
}
