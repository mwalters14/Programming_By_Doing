package Problem_7;

import java.util.ArrayList;

public class Find_Prime {
    public static void main(String[] args) {
        int size = 10;
        boolean prime = false;
        boolean found = false;

        ArrayList<Integer> primes = new ArrayList<Integer>(size);
        for (int i = 1; i <= 999999; i++) {
            found = false;
            for (int e = 1; e <= 999999; e++) {
                if (i % e == 0 && i != e && e != 1) {
                    found = true;
                }
            }
            if (!found) {
                System.out.println(i + " has been added");
                primes.add(i);
            }

            if (primes.size() == 10002) {
                break;
            }
        }
        System.out.print("Prime: ");
        find_prime(primes, 10001);
    }

    public static void find_prime(ArrayList<Integer> primes, int find) {
        System.out.println(primes.get(find));
    }
    public static void display_array(ArrayList<Integer> primes) {
        for (int i = 0; i < primes.size(); i++) {
            if (i+1 == primes.size()) {
                System.out.print(primes.get(i));
            } else
                System.out.print(primes.get(i) + ", ");
        }
    }
}
