// In order to generate a random number we need to import the library
import java.util.Random;

public class Randomness {
  public static void main(String[] args) {
    // Create a random number generator object
    //seed:initial value
    Random r = new Random(1);

    // Random integer generated 1 - 10
    int x = r.nextInt(10);

    System.out.println( "My random number is " + x );

    System.out.println( "Here are some numbers from 1 to 5!" );
    System.out.print( 1  + r.nextInt(5) + " " );
    System.out.print( 1  + r.nextInt(5) + " " );
    System.out.print( 1  + r.nextInt(5) + " " );
    System.out.print( 1  + r.nextInt(5) + " " );
    System.out.print( 1  + r.nextInt(5) + " " );
    System.out.print( 1  + r.nextInt(5) + " " );
    System.out.println();

    System.out.println( "Here are some numbers from 1 to 100!" );
    System.out.print( 1 + r.nextInt(100) + "\t" );
    System.out.print( 1 + r.nextInt(100) + "\t" );
    System.out.print( 1 + r.nextInt(100) + "\t" );
    System.out.print( 1 + r.nextInt(100) + "\t" );
    System.out.print( 1 + r.nextInt(100) + "\t" );
    System.out.print( 1 + r.nextInt(100) + "\t" );
    System.out.println();

    int num1 = 1 + r.nextInt(10);
    int num2 = 1 + r.nextInt(10);

    if ( num1 == num2 )
    {
      System.out.println( "The random numbers were the same! Weird." );
    }
    if ( num1 != num2 )
    {
      System.out.println( "The random numbers were different! Not too surprising, actually." );
    }
  }
}
