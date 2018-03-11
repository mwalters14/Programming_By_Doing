public class BMICategory {
  public static void main(String[] args) {
    BMICalculator calculator = new BMICalculator();

    double bmi;
    String result = "";

    // bmi = calculator.BMIUsingMetersAndKg();
    bmi = calculator.BMIUsingInchesAndPounds();
    // bmi = calculator.BMIUsingFeetAndInches();

    if (bmi < 15.0) {
      result = "very severely underweight";
    }
    if (bmi > 15 && bmi < 16) {
      result = "severely underweight";
    }
    if (bmi > 16.1 && bmi < 18.4) {
      result = "underweight";
    }
    if (bmi > 18.5 && bmi < 24.9) {
      result = "normal weight";
    }
    if (bmi > 25.0 && bmi < 29.9) {
      result = "overweight";
    }
    if (bmi > 30.0 && bmi < 34.9) {
      result = "moderately obese";
    }
    if (bmi > 35.0 && bmi < 39.9) {
      result = "severely obese";
    }
    if (bmi > 40) {
      result = "very severely obese";
    }

    System.out.println("BMI Category: " + result);
  }
}
