import java.util.Random;

public class FlickerPhrase
{
	public static void main( String[] args )
	{
		Random rng = new Random();
		int r;
    int sleepTime = 1000;
		for ( int i=0; i<100000; i++ )
		{
			r = 1 + rng.nextInt(5);
			// Write five if statements here.
			if (r == 1) {
        first();
        callSleep(sleepTime);
      }else if (r == 2) {
        second();
        callSleep(sleepTime);
      } else if (r == 3) {
        third();
        callSleep(sleepTime);
      } else if (r == 4) {
        fourth();
        callSleep(sleepTime);
      } else if (r == 5) {
        fifth();
        callSleep(sleepTime);
      }



			// Optional: after the if statements are over, add in a slight delay.
		}

		System.out.println("I pledge allegiance to the flag.");

	}
  public static void callSleep(int time){
    try {
      Thread.sleep(time);
     } catch (Exception e) {
          System.out.println(e);
       }
   }
	public static void first()
	{
		System.out.print("I                               \r");
	}

	public static void second()
	{
		System.out.print("  pledge                        \r");
	}

	public static void third()
	{
		System.out.print("         allegiance             \r");
	}

	public static void fourth()
	{
		System.out.print("                    to the      \r");
	}

	public static void fifth()
	{
		System.out.print("                           flag.\r");
	}
}
