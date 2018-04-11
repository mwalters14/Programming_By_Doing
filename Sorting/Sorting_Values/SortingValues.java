public class SortingValues
{
	public static void main( String[] args )
	{
		int[] arr = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };
    int lowest = 0;
    int holder = 0;
		// Display the original (unsorted values)
		System.out.print("before: ");
		for ( int i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();

		// Swap the values around to put them ascending order.

		for (int i = 0; i < arr.length ; i++)
		{
      for (int e = 0; e < arr.length ; e++ )
			{
        holder = arr[i];
        if (arr[i] < arr[e]) {
          arr[i] = arr[e];
          arr[e] = holder;
        }
			}
    }



		// Display the values again, now (hopefully) sorted.
		System.out.print("after : ");
		for ( int i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();
	}
}
