package Problem_5;

public class Smallest_Multiple {
    public static void main(String[] args) {
        int smallest = 0;
        int number = 0;
        boolean result = false;

        for (int i = 1; i <= 999999999; i++) {
            for (int e = 1; e <= 20; e++) {
                if (i % e == 0) {
                   result = true;
                } else {
                    result = false;
                    break;
                }
            }
            if (result) {
                smallest = i;
                break;
            }
        }
        System.out.println(smallest);
    }

    public static boolean check_multiple(int max) {
        int i = 10;

        while(i != 0) {
            if (max % i == 0) {
                System.out.println("I " + i);
                System.out.println("max " + max);
                return true;
            }
            i--;
        }
        return false;
    }

}
