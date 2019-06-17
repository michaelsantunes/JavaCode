package hackerrank;

import java.util.Arrays;
import java.util.Random;

public class SimpleArraySum {

    static int simpleArraySum(int[] ar) {
        return Arrays.stream(ar).sum();
    }

    public static void main(String[] args) {
        int finished = 30;
        int count = 0;
        int[] ar = new int[finished];
        while ( count < finished) {
            int value = new Random().nextInt(10);
            ar[count] = value;
            count++;
        }

        System.out.println("Sum = " + simpleArraySum(ar));

    }
}
