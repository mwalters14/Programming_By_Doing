import java.util.Scanner;

public class CountingFor
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it five times." );
        System.out.print( "Message: " );
        String message = keyboard.nextLine();

        // n = n+1 means increment n by 1 every loop same thing as n++
        // int n = 1 is initializing a variable counter for the four loop

        for ( int n = 2; n <= 10 ; n += 2 )
        {
            System.out.println( n + ". " + message );
        }

    }
}
