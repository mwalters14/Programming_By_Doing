package com.company.pbd.Problem_3;

import java.math.BigInteger;

import static java.lang.Math.sqrt;

public class Primes {
    public static void main(String[] args) {
        long number = 600851475143L;
        BigInteger b1 = new BigInteger("600851475143");
        BigInteger b2 = new BigInteger("2");


        while (number % 2 == 0) {
            System.out.println(2);

            number = number / 2;
        }

        for (int i = 3; i <= sqrt(number); i = i+2) {
            while (number % i == 0) {
                System.out.println(i);
                number = number / i;
            }
        }
        System.out.println(number);
    }
}
