package com.company.pbd.Problem_2;

import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        int max = 4000000;
        int size = 100;
        int sum = 0;

        ArrayList<Integer> fibo = new ArrayList<Integer>(size);
        fibo.add(1);
        fibo.add(2);

        for (int i = 1; i < size; i++) {
            if (fibo.get(i) > max) {
                break;
            } else if (fibo.get(i) + fibo.get(i-1) > max) {
                break;
            } else {
                fibo.add(fibo.get(i) + fibo.get(i - 1));
            }
        }

        for (int i = 0; i < fibo.size(); i++) {
            if (fibo.get(i) % 2 == 0) {
                sum += fibo.get(i);
            }
        }

        display_array(fibo);
        System.out.println("SUM of evens: " + sum);


    }

    public static void display_array(ArrayList<Integer> fibo) {
        for (int i = 0; i < fibo.size(); i++) {
            System.out.println(fibo.get(i));
        }
    }
}
