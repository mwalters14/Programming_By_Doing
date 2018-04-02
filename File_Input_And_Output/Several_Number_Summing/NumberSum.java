package com.pbd.SummingSeveralNumbers;

import java.io.*;
import java.util.Scanner;

public class NumberSum {
    public static void main(String [] args) {
        System.out.print("What file would you like me to read: ");
        String filename = user_input();
        String file = "C:\\Users\\mwalters\\IdeaProjects\\Number_Summing\\src\\com\\pbd\\SummingSeveralNumbers\\" + filename;

        Scanner sc = readFile(file);

        while (sc == null) {
            System.out.print("\nWhat file would you like me to read: ");
            filename = user_input();
            file = "C:\\Users\\mwalters\\IdeaProjects\\Number_Summing\\src\\com\\pbd\\SummingSeveralNumbers\\" + filename;
            sc = readFile(file);
        }

        int sum = 0;

        while (sc.hasNext()) {
            int number = sc.nextInt();
            System.out.print(number + " ");
            sum += number;
        }

        System.out.println("");
        System.out.println("Sum: " + sum);
    }

    public static String user_input() {
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.next();
        return input;
    }

    public static Scanner readFile(String filename){
        File file = new File(filename);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (IOException e) {
            System.out.println("Please enter a valid filename");
        }
        return sc;
    }
}
