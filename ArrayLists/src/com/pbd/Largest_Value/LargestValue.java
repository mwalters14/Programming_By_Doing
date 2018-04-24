package com.pbd.Largest_Value;

import java.util.ArrayList;
import java.util.Random;

public class LargestValue {
    public static void main(String[] args) {
        int size = 10;
        ArrayList<Integer> numbers = new ArrayList<Integer>(size);
        generate_array(numbers, size);
        System.out.println(numbers);
        find_largestValue(numbers);
    }

    private static void find_largestValue(ArrayList<Integer> array) {
        int largest = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > largest) {
                largest = array.get(i);
            }
        }
        System.out.println("The largest value in the array is " + largest);
    }

    private static void generate_array(ArrayList<Integer> array, int size) {
        for (int i = 0; i < size; i++) {
            int random = get_rand(50);
            array.add(random);
        }
    }

    private static int get_rand(int max) {
        Random random = new Random();
        return 1 + random.nextInt(max);
    }
}
