public class NumberPuzzle {
  public static void main(String[] args) {
    option1();
  }

  public static void option1(){
    for (int i = 10; i <= 56 ; i++ ) {
      for (int e = 10; e <= 56 ; e++ ) {
        if ((i+e) > 10) {
          System.out.println("Pair: " + i + " " + e);
        }
      }
    }
  }
}
