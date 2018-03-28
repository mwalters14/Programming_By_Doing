package com.pbd.NumberPuzzle_I;

public class NumberPuzzle {
    public static void main(String [] args) {
        for (int i = 10; i < 100; i++) {
            for (int e = 10; e < 100; e++) {
                if ((i + e) == 60 && (i - e) == 14) {
                    System.out.println("Pair: " + i + " " + e);
                }
            }
        }
    }
}
