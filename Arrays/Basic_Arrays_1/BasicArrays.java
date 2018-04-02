public class BasicArrays {
  public static void main(String[] args) {
    int[] array = {-113,-113,-113,-113,-113,-113,-113,-113,};

    for (int i = 0; i < array.length ; i++ ) {
      System.out.println("Slot " + i + " contains a " + array[i]);
    }
    // for (int arr : array) {
    //   System.out.println(arr);
    // }
  }
}
