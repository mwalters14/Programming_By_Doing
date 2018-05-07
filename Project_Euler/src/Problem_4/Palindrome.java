package Problem_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        String number = "";

        int size = 6;
        int largest = 0;
        int counter = 0;
        int product = 0;

        for (int i = 900; i < 1000; i++) {
            for (int e = 900; e < 1000; e++) {
                product = (i * e);
                number = Integer.toString(product);
                char[] array = number.toCharArray();

                if (istPalindrom(array)) {
                    if (product > largest) {
                        largest = product;
                    }
                }
            }
        }
        System.out.println("Palindrome: " + largest);
    }

    private static boolean istPalindrom(char[] word){
        int i1 = 0;
        int i2 = word.length - 1;
        while (i2 > i1) {
            if (word[i1] != word[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
}
