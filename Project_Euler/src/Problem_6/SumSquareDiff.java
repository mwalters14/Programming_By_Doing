package Problem_6;

public class SumSquareDiff {
    public static void main(String[] args) {
        int sq_sum = 0;
        int sum_ofSq = 0;
        int total = 0;
        int difference = 0;

        for (int i = 0; i <= 100; i++) {
            sq_sum += Math.pow(i, 2);
        }

        for (int i = 0; i <= 100; i++) {
            total += i;
        }

        sum_ofSq = total * total;
        difference = sum_ofSq - sq_sum;

        System.out.println(sum_ofSq + " - " + sq_sum + " = " + difference);
    }
}
