package com.pbd.Refresher;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        String name = user_input();
        loop(name);
    }

    public static String user_input() {
        Scanner keyboard = new Scanner(System.in);

        String input = keyboard.next();
        return input;
    }

    public static void loop(String word) {
        int count = 10;
        if (word.equals("Mitchell")) {
            count = 5;
        }

        for (int i = 0; i <= count; i++) {
            System.out.println(word);
        }
    }
}
