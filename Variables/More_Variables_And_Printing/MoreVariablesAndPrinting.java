public class MoreVariablesAndPrinting
{
    public static void main( String[] args )
    {
        String Name, Eyes, Teeth, Hair;
        int Age, HeightInInches, Weight;

        Name = "Myron Walters";
        Age = 22;     // not a lie
        //Height = ConvertFeetAndInches(5,11);  // Feet,Inches (5'11)
        HeightInInches = 71;
        String HeightInFeet = ConvertInchesToFeet(71);
        Weight = 165; // lbs
        Eyes = "Brown";
        Teeth = "White";
        Hair = "Brown";

        System.out.println( "Let's talk about " + Name + "." );
        System.out.println( "He's " + HeightInInches + " inches tall." );
        System.out.println( "He's " + Weight + " pounds heavy." );
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "He's got " + Eyes + " eyes and " + Hair + " hair." );
        System.out.println( "His teeth are usually " + Teeth + " depending on the coffee." );

        // This line is tricky; try to get it exactly right.
        System.out.println( "If I add " + Age + ", " + HeightInInches + ", and " + Weight
            + " I get " + (Age + HeightInInches + Weight) + "." );

        System.out.println("If I Convert " + HeightInInches + " to Feet And Inches: " + ConvertInchesToFeet(HeightInInches));
    }

    public static int ConvertFeetAndInches(int feet, int inches) {
      return (int) (feet * 12.000) + inches;
    }

    public static String ConvertInchesToFeet(int inches) {
      String Conversion = (int) (inches / 12.000) + " feet " + (int)(inches % 12.000) + " inches";
      return Conversion;
    }
}
