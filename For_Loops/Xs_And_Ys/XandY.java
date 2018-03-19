// Write another program that uses a for loop. With the loop,
// make the variable x go from -10 to 10, counting by 0.5.
// (This means that x can't be an int.)

// Inside the body of the loop, make another variable
// y become the current value of x squared.
// Then display the current values of both x and y.

public class XandY {
  public static void main(String[] args) {
    Start();
  }

  public static void Start() {
    System.out.println("x     y");
    System.out.println("---------------");
    Counter();
  }

  public static void Counter() {
    for (double i = -10; i <= 10 ; i += 0.5 ) {
      System.out.println(i + "  " + i*i);
    }
  }
}
