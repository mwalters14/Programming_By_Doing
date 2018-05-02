package com.pbd.Where_Is_It;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        int size;
        size = 10;

        ArrayList list = new ArrayList(size);
        list = create_arraylist(list, size);

        System.out.println(list);

        find_value(list, size);
    }

    public static void find_value(ArrayList<Integer> array, int size) {
        Scanner keyboard = new Scanner(System.in);
        int value_toFind = 0;
        boolean found = false;

        while (value_toFind != -1) {
            System.out.print("Which value do you want to find: ");
            value_toFind = keyboard.nextInt();

            found = false;
            for (Integer number : array) {
                if (number == value_toFind) {
                    found = true;
                    System.out.println(value_toFind + " is in the array");
                    System.out.println("Slot: " + array.lastIndexOf(number));
                    break;
                }
            }

            if (!found) {
                System.out.println(value_toFind + " is not in the array");
            }
        }
    }

    public static ArrayList create_arraylist(ArrayList array, int size) {
        int random;
        for (int i = 0; i < size; i++) {
            random = get_rand(50);
            array.add(random);
        }
        return array;
    }

    public static int get_rand(int max) {
        Random random = new Random();
        int number = 1 + random.nextInt(max);
        return number;
    }
}
