import java.util.Random;

public class CopyArray {
  public static void main(String[] args) {
    int[] original = fill_array();
    int[] clone = copy_array(original);
    add_to_array(clone);
    compare_arrays(original, clone);
  }

  public static int[] add_to_array(int[] clone) {
    for (int i = clone.length - 1; i < clone.length  ; i++ ) {
      clone[i] = -7;
    }

    return clone;
  }

  public static void compare_arrays(int [] array1, int[] array2) {
    System.out.print("Array 1: ");
    for (int i = 0; i < array1.length ; i++) {
      System.out.print(array1[i] + " ");
    }
    System.out.println("");
    System.out.println("----------------------------");

    System.out.print("Array 2: ");
    for (int i = 0; i < array2.length ; i++) {
      System.out.print(array2[i] + " ");
    }
  }

  public static int[] copy_array(int[] original) {
    int[] clone = new int[10];
    System.arraycopy( original, 0, clone, 0, 9);
    return clone;
  }
  public static int[] fill_array() {
    int [] array = new int[10];

    for (int i = 0; i < array.length ; i++ ) {
      array[i] = get_rand(99);
    }

    return array;
  }
  public static int get_rand(int max) {
    Random random = new Random();
    int number;
    number = 1 + random.nextInt(max);
    return number;
  }
}
