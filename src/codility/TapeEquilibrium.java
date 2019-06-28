package codility;

import java.util.Arrays;
import java.util.Random;

public class TapeEquilibrium {

    public static int solution( int[] A) {
        int p = Integer.MAX_VALUE;
        int sum = Arrays.stream(A).sum();
        int left = 0;
        for ( int i = 0; i < A.length - 1; i++) {
            left += A[i];
            int right = sum - left;
            int diff = Math.abs(left - right);
            if ( diff < p ) {
                p = diff;
            }
        }
        return p;
    }
}
