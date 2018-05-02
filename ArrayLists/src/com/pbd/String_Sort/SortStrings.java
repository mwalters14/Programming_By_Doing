package com.pbd.String_Sort;

import java.util.ArrayList;

public class SortStrings {
    public static void main(String[] args) {
        int size = 10;
        ArrayList<String> strings = new ArrayList<String>(size);
        strings.add("Allie");
        strings.add("Leo");
        strings.add("Apple");
        strings.add("Orange");
        strings.add("Pear");


        System.out.println("Unsorted: " + strings);
        bubble_sort(strings);
        System.out.println("Sorted:   " + strings);


    }

    private static void bubble_sort(ArrayList<String> array) {
        boolean swapped = true;
        int j = 0;
        while (swapped) {
            swapped = false;
            j++;

            for (int i = 0; i < array.size() - j ; i++) {
                String temp = array.get(i);
                String swap = array.get(i+1);

                if (temp.compareTo(swap) > 0) {
                    swap(array,i);
                    swapped = true;
                }
            }
        }
    }

    private static void swap(ArrayList<String> array, int i ) {
        String temp = array.get(i);
        String swap = array.get(i+1);

        array.remove(i);
        array.add(i, temp);

        array.remove(i+1);
        array.add(i, swap);
    }
}
