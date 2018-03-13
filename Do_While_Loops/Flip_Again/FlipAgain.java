import java.util.Random;
import java.util.Scanner;

public class FlipAgain
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random();

    // Need to intialize again with a while loop because
    // While loops check the condition before executing any code.
    // Without intializing the condition checks to see
    //if again is equal to y finds that again is equal to nothing and wouldn't compile.
    // String again = 0;
		String again;

    // Code works without initializing again because
    // do does not care about the condition on the initial execute.
    do {
      int flip = rng.nextInt(2);
			String coin;

			if ( flip == 1 )
				coin = "HEADS";
			else
				coin = "TAILS";

			System.out.println( "You flip a coin and it is... " + coin );

			System.out.print( "Would you like to flip again (y/n)? " );
			again = keyboard.next();

    } while ( again.equals("y"));
	}
}
