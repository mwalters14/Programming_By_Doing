package com.pbd.Locate_Largest_Value;

import java.util.ArrayList;
import java.util.Random;

public class LocateLargestValue {
    public static void main(String[] args) {
        int initial_size = 10;
        ArrayList<Integer> numbers = new ArrayList<Integer>(10);

        populate_array(numbers, initial_size);
        System.out.println(numbers);
        locate_largestValue(numbers);
    }

    private static void locate_largestValue(ArrayList<Integer> array) {
        int largest = 0;
        int location = -1;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > largest) {
                largest = array.get(i);
            }
        }

        location = array.indexOf(largest);

        System.out.println("The largest value was " + largest);
        System.out.println("It's location in the array is slot " + (location + 1));
    }

    private static void populate_array(ArrayList<Integer> array, int initial_size) {
        for (int i = 0; i < initial_size; i++) {
            int random = random(100);
            array.add(random);
        }
    }

    private static int random(int max) {
        Random random = new Random();
        return 1 + random.nextInt(max);
    }
}
