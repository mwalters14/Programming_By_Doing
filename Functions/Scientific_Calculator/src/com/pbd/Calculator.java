package com.pbd;

import java.util.Scanner;

public class Calculator {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String [] args) {
        start();
    }
    public static void start() {
        double num1, num2;
        String equation, op, string_num1, string_num2;

        do {
            System.out.print("Enter an equation: ");
            equation = input();
            String [] split_equation = equation.replaceAll("\\s","").split("(?<=[-+*/^])|(?=[-+*/^])");

            string_num1 = split_equation[0];
            string_num2 = split_equation[2];

            if (Numeric.isNumeric(string_num1) && Numeric.isNumeric(string_num2)) {
                op = split_equation[1];
                if (Numeric.isInteger(string_num1) && Numeric.isInteger(string_num2)) {
                    int result = -1;
                    double division_result = -1;

                    num1 = Double.parseDouble(split_equation[0]);
                    num2 = Double.parseDouble(split_equation[2]);

                    if (op.equals("+")) {
                        result = (int) add(num1,num2);
                    } else if (op.equals("-")) {
                        result = (int) subtract(num1,num2);
                    } else if (op.equals("*")) {
                        result = (int) multiply(num1,num2);
                    } else if (op.equals("/")) {
                        division_result = divide(num1, num2);
                    } else if (op.equals("^")) {
                        result = (int) exponents(num1, num2);
                    } else {
                        System.out.println("I don't understand your operand");
                    }

                    if (op.equals("/")) {
                        System.out.println(division_result);
                    } else {
                        System.out.println(result);
                    }

                } else if (Numeric.isDouble(string_num1) && Numeric.isDouble(string_num2)) {
                    double result = -1;
                    num1 = Double.parseDouble(split_equation[0]);
                    num2 = Double.parseDouble(split_equation[2]);

                    if (op.equals("+")) {
                        result = add(num1, num2);
                    } else if (op.equals("-")) {
                        result = subtract(num1, num2);
                    } else if (op.equals("*")) {
                        result = multiply(num1,num2);
                    } else if (op.equals("/")) {
                        result = divide(num1, num2);
                    } else if (op.equals("^")) {
                        result = exponents(num1, num2);
                    } else {
                        System.out.println("I don't understand your operand");
                    }
                    System.out.println(result);
                }
            }
        } while (Double.valueOf(string_num1) != 0);
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

    public static String input(){String input = keyboard.nextLine(); return input;}
    public static double add(double a, double b){return a + b;}
    public static double subtract(double a, double b){return a - b;}
    public static double multiply(double a, double b){return a * b;}
    public static double divide(double a, double b){return a / b;}
    public static double exponents(double a, double b) {return Math.pow(a, b);}
}
