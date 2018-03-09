import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {
    // BMIUsingMetersAndKg();
    // BMIUsingInchesAndPounds();
    // BMIUsingFeetAndInches();
  }

  public static void BMIUsingMetersAndKg(){
    Scanner keyboard = new Scanner(System.in);

    float height;
    int weight;
    double bmi;

    System.out.print("Your height in m: ");
    height = keyboard.nextFloat();

    System.out.print("Your weight in kg: " );
    weight = keyboard.nextInt();

    bmi = weight / (height * height);
    System.out.println("Your BMI is " + bmi);
  }

  public static void BMIUsingInchesAndPounds() {
    Scanner keyboard = new Scanner(System.in);


    double inches, pounds, height, weight, bmi;

    System.out.print("Your height in inches: ");
    inches = keyboard.nextDouble();

    System.out.print("Your weight in pounds: ");
    pounds = keyboard.nextDouble();

    height = ConvertInchesToMeters(inches);
    weight = ConvertPoundsToKg(pounds);
    bmi = (weight / (height * height));

    System.out.println(weight + "/" + (height * height) + " = " + bmi);

    System.out.println("Your BMI is " + bmi);
  }

  public static void BMIUsingFeetAndInches() {
    Scanner keyboard = new Scanner(System.in);

    int feet, inches;
    double convertInches, height, pounds, bmi, weight;

    System.out.println("Enter your height (feet): ");
    feet = keyboard.nextInt();

    System.out.println("Enter your height (inches): ");
    inches = keyboard.nextInt();

    System.out.print("Your weight in pounds: ");
    pounds = keyboard.nextDouble();

    convertInches = ConvertFeetAndInches(feet, inches);
    height = ConvertInchesToMeters(convertInches);
    weight = ConvertPoundsToKg(pounds);

    bmi = (weight / (height * height));

    System.out.println(weight + "/" + (height * height) + " = " + bmi);
    System.out.println("Your BMI is " + bmi);
  }

  public static double ConvertPoundsToKg(double pounds) {
    return (pounds * 0.453592);
  }

  public static double ConvertInchesToMeters(double inches) {
    return (inches * 0.0254);
  }

  public static int ConvertFeetAndInches(int feet, int inches) {
    return (int) (feet * 12.000) + inches;
  }
}
