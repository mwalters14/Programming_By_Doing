package com.pbd.Basic_ArrayList_4;

import java.util.ArrayList;
import java.util.Random;

public class BasicArrayList {
    public static void main(String[] args) {
        int size = 10;

        ArrayList<Integer> numbers = new ArrayList<Integer>(size);
        populate_array(numbers,size);
        ArrayList<Integer> numbers2 = copy_array(numbers);

        numbers.remove(numbers.size() - 1);
        numbers.add(-7);

        System.out.println("ArrayList 1 : " + numbers);
        System.out.println("ArrayList 2 : " + numbers2);
    }

    public static ArrayList<Integer> copy_array(ArrayList original) {
        ArrayList<Integer> clone = new ArrayList<Integer>(original);
        ArrayList<Integer> return_clone = new ArrayList<Integer>(original.size());

        for(Integer number : clone) {
            return_clone.add(number);
        }
        return return_clone;
    }
    public static void populate_array(ArrayList numbers, int size) {
        int random;
        for (int i = 0; i < size; i++) {
            random = generate_random(10);
            numbers.add(random);
        }
    }

    public static int generate_random(int max) {
        Random random = new Random();
        return 1 + random.nextInt(max);
    }
}
