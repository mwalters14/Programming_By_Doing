package com.pbd.Multiples;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int number = user_number();
        multiples(number);
    }

    public static void multiples(int number) {
        for (int i = 1; i <= 12; i++) {
            System.out.println(number + "x" + i + " = " + number * i);
        }
    }

    public static int user_number() {
        Scanner keyboard = new Scanner(System.in);

        int number = keyboard.nextInt();
        return number;
    }

}
