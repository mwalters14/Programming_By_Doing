public class ElseIf{
  public static void main(String[] args) {
    int people = 30;
		int cars = 40;
		int buses = 15;

    // If condition true execute
		if ( cars > people )
		{
			System.out.println( "We should take the cars." );
		} // else if this condition is true execute this command
		else if ( cars < people )
		{
			System.out.println( "We should not take the cars." );
		} // If no condition is met, execute this
		else // If you remove else if the else always executes.
		{
			System.out.println( "We can't decide." );
		}


		if ( buses > cars )
		{
			System.out.println( "That's too many buses." );
		}
		else if ( buses < cars )
		{
			System.out.println( "Maybe we could take the buses." );
		}
		else
		{
			System.out.println( "We still can't decide." );
		}


		if ( people > buses )
		{
			System.out.println( "All right, let's just take the buses." );
		}
		else
		{
			System.out.println( "Fine, let's stay home then." );
		}
  }
}
