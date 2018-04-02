import java.util.Random;

public class BasicArrays {
  public static void main(String[] args) {
    fill_array();
  }

  public static void fill_array() {
    int[] array = new int[1000];

    for (int i = 0; i < array.length ; i++ ) {
      array[i] = get_rand(89);
      System.out.print(array[i] + " ");
    }
  }

  public static int get_rand(int max) {
    Random random = new Random();

    int number;
    number = 10 + random.nextInt(max);
    return number;
  }
}
