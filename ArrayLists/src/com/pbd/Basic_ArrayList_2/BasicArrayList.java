package com.pbd.Basic_ArrayList_2;

import java.util.ArrayList;
import java.util.Random;

public class BasicArrayList {
    public static void main(String[] args) {
        int random;
        int maxRandom = 100;
        int n = 10;

        ArrayList<Integer> numbers = new ArrayList<Integer>(n);

        for (int i = 0; i < n; i++) {
            random = generate_random(maxRandom);
            numbers.add(random);
        }

        System.out.println("ArrayList: " + numbers);
    }

    public static int generate_random(int max) {
        Random random = new Random();
        int number = 1 + random.nextInt(max);
        return number;
    }
}
