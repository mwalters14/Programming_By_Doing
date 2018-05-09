package com.company.pbd.Problem_1;

import java.util.ArrayList;
// Answer: 233168
public class Multiples {
    public static void main(String[] args) {
        int size = 1000;
        ArrayList<Integer> multiples = new ArrayList<Integer>(size);

        for (int i = 1; i < size; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                multiples.add(i);
            }
        }
        add(multiples);
    }

    public static void add(ArrayList<Integer> multiples) {
        int sum = 0;
        for (int i = 0; i < multiples.size(); i++) {
            sum += multiples.get(i);
        }

        System.out.println("The sum of the array is " + sum);
    }

    public static void display_array(ArrayList<Integer> multiples) {
        for (int i = 0; i < multiples.size(); i++) {
            System.out.println(multiples.get(i));
        }
    }
}
