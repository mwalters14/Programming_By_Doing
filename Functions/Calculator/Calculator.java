import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {

  }

  public static void result_calc() {
    double num1, num2;
    String op = "";

    num1 = user_input();
    op = user_input();
    num2 = user_input();

    num1 = Integer.parseInt(num1);
    num2 = Integer.parseInt(num2);

    if (isNumeric(num1) && isNumeric(num2)) {
      if (isInteger(num1) && isInteger(num2) && op.equals("+")) {

        double result = add_dec(num1, num2);
        System.out.println((int) (result));
      }
    }
  }

  public static String user_input() {
    Scanner keyboard = new Scanner(System.in);

    String input;

    input = keyboard.next();
    return input;
  }

  public class Numeric
  {
  	public boolean isNumeric( String s )
  	{
  		return ( isDouble(s) || isInteger(s) );
  	}

  	public boolean isDouble( String s )
  	{
  		double n = 0;
  		try
  		{
  			n = Double.valueOf( s );
  		}

  		catch ( NumberFormatException e )
  		{
  			return false;
  		}

  		return true;
  	}

  	public boolean isInteger( String s )
  	{
  		int n = 0;
  		try
  		{
  			n = Integer.valueOf( s );
  		}

  		catch ( NumberFormatException e )
  		{
  			return false;
  		}

  		return true;
  	}
  }
  public static double add_dec(double a, double b) {
    System.out.println(a + b);
    return a + b;
  }
}
