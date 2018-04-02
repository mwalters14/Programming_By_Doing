package com.pbd.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        result_calc();
    }

    //todo: Replace duplicate code with functions!
    // Refactor.
    public static void result_calc() {
        String equation, string_num1, string_num2;
        double num1, num2;
        String op;
        String[] parse_equation;
        do {
            System.out.print("Enter an equation: ");
            equation = user_input(); // Take in equation as string,
            parse_equation = equation.split(" "); // equation must include a space right now. Future release will be able to parse with or without space.
            string_num1 = parse_equation[0];
            op = parse_equation[1];
            string_num2 = parse_equation[2];

            if (Numeric.isInteger(string_num1) && Numeric.isInteger(string_num2)) { // If user entered numbers are both integers, return integers.
                int result = 0;
                num1 = Integer.valueOf(string_num1);
                num2 = Integer.valueOf(string_num2);

                // todo: Replace with switch statement.
                if (op.equals("+")) {
                     result = (int) add(num1, num2);
                     System.out.println(result);
                } else if (op.equals("/")) {
                    result = (int) divide(num1, num2);
                    System.out.println(result);
                } else if (op.equals("*")) {
                    result = (int) multiply(num1, num2);
                    System.out.println(result);
                } else if (op.equals("-")) {
                    result = (int) subtract(num1, num2);
                    System.out.println(result);
                } else {
                    System.out.println("I don't understand your operand!");
                }
            } else if (Numeric.isDouble(string_num1) && Numeric.isDouble(string_num2)) { // If user entered numbers are both double, return double.
                double result = 0;
                num1 = Double.valueOf(string_num1);
                num2 = Double.valueOf(string_num2);

                if (op.equals("+")) {
                    result = add(num1, num2);
                    System.out.println(result);
                } else if (op.equals("/")) {
                    result = divide(num1,num2);
                    System.out.println(result);
                } else if (op.equals("*")) {
                    result = multiply(num1,num2);
                    System.out.println(result);
                } else if (op.equals("-")) {
                    result = subtract(num1, num2);
                    System.out.println(result);
                } else {
                    System.out.println("I don't understand your operand!");
                }
            }
        } while (Double.valueOf(string_num1) != 0);
    }

    public static String user_input() {
        Scanner keyboard = new Scanner(System.in);

        String input;

        input = keyboard.nextLine();
        return input;
    }

    public static class Numeric
    {
        public static boolean isNumeric( String s )
        {
            return ( isDouble(s) || isInteger(s) );
        }

        public static boolean isDouble( String s )
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

        public static boolean isInteger( String s )
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
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }




}
