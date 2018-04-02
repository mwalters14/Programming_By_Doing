import java.util.Random;

public class BasicArrays {
  public static void main(String[] args) {
    fill_array();
  }

  public static void fill_array() {
    int[] array = new int[10];

    for (int i = 0; i < array.length ; i++ ) {
      array[i] = get_rand(100);
      System.out.println("Slot " + i + " contains " + array[i]);
    }

  }

  public static int get_rand(int max) {
    Random random = new Random();

    int number = 1 + random.nextInt(max);
    return number;
  }
}
