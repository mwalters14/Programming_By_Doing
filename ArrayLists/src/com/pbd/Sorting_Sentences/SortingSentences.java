package com.pbd.Sorting_Sentences;

import java.util.ArrayList;
import java.util.Scanner;

public class SortingSentences {
    public static void main(String[] args) {
        String sentence;
        sentence = get_sentence();

        ArrayList<String> split_array = split_sentence(sentence);
        System.out.println("Unsorted:  " + split_array);
        bubble_sort(split_array);
        System.out.println("Sorted:  " + split_array);
    }

    private static void tester() {
        String sentence = "I Will Accomplish My Goals and Dreams";
        ArrayList<String> goals = split_sentence(sentence);
        System.out.println("Unsorted:  " + goals);
        bubble_sort(goals);
        System.out.println("Sorted:  " + goals);
    }

    private static ArrayList<String> split_sentence(String sentence) {
        ArrayList<String> array = new ArrayList<String>();
        for (int i = 0; i < sentence.split(" ").length; i++) {
            array.add(sentence.split(" ")[i]);
        }
        return array;
    }
    private static String get_sentence() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Sentence: ");
        return keyboard.nextLine().toLowerCase();
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

                if (temp.compareTo(swap) >= 0) {
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

