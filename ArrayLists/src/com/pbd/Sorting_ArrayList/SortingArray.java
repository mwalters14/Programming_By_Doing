package com.pbd.Sorting_ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class SortingArray {
    public static void main(String[] args) {
        int initial_size = 10;
        ArrayList<Integer> numbers = new ArrayList<Integer>(10);

        populate_array(numbers, initial_size);
        System.out.print("Unsorted: " + numbers);

        bubble_sort(numbers);
        System.out.println();

        System.out.print("Sorted:   ");
        System.out.println(numbers);
    }

    private static void bubble_sort(ArrayList<Integer> array) {
        boolean swapped = true;
        int j = 0;
        while (swapped) {
            swapped = false;
            j++;

            for (int i = 0; i < array.size() - j ; i++) {
                int temp = array.get(i);
                int swap = array.get(i+1);

                if (temp > swap) {
                    swap(array,i);
                    swapped = true;
                }
            }
        }
    }

    private static void swap(ArrayList<Integer> array, int i ) {
        int temp = array.get(i);
        int swap = array.get(i+1);

//        a[i] = a[i + 1];

        array.remove(i);
        array.add(i, temp);

        array.remove(i+1);
        array.add(i, swap);

//        a[i + 1] = temp;
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

