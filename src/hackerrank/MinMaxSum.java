package hackerrank;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class MinMaxSum {

    // Complete the miniMaxSum function below.
    public static void miniMaxSum(int[] arr) {
        long sum = 0L;
        for ( long value : arr) {
            sum = sum + value;
        }
        Arrays.sort(arr);
        long max = sum - (long) arr[0];
        long min = sum - (long) arr[arr.length-1];
        System.out.println(BigInteger.valueOf(min) + " " + BigInteger.valueOf(max));
    }
    public static void main(String[] args) {
        int[] arr = {7,69,2,221,8974};
        miniMaxSum(arr);
    }
}
