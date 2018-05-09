package com.company.pbd.Problem_4;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
       String oRIGINAL = "Hello";
       String[] array = one.split("");
       String[] array2 = new String[one.length()];
       int counter = 0;

       for (int i = one.length() - 1; i >= 0; i--) {
           array2[counter] = array[i];
           counter++;
       }

       String delimiter = "";
       String result = String.join(delimiter, array2);

       System.out.println(result);
    }
}
