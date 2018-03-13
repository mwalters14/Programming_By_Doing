import java.util.Scanner;

public class CountingWhile
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

    System.out.print( "Message: " );
    String message = keyboard.nextLine();

    System.out.print("How many times: ");
    int userCount = keyboard.nextInt();

    System.out.println("I'm going to display it " + userCount);

    int n = 1;
    // Change counter to be n less than 10
		while ( n < userCount )
		{
			System.out.println( (n*10) + ". " + message );
      // Add 1 to n after each iteration.
			n++;
		}

	}
}
