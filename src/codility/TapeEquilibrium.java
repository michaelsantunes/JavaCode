package codility;

import java.util.Arrays;
import java.util.Random;

public class TapeEquilibrium {

    /*

        Any integer P, such that 0 < P < N,
        splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
        The difference between the two parts is the value of:
        |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... +


     */


    public static int solution( int[] A) {
        int[] array = A;
        if ( array.length == 0 )
            return 1;
        int diff = (Arrays.stream(array).sum());
        if ( diff == 0 )
            return 0;

        int v1 = array[0];
        for ( int i = 0; i < array.length; i++ ) {
            int calc = Math.abs(v1 - (Arrays.stream(array).sum() - v1));
            if ( calc < diff ) {
                diff = calc;
                if ( diff <= 1 )
                    break;
            }
            if ( (i + 1) < array.length ) {
                v1 = v1 + array[i + 1];
            }
        }

        return diff;
    }


    public static void main(String[] args) {
        int[] list = new int[1000];
        for ( int i = 0; i < list.length - 1 ; i++ ) {
            list[i] = new Random().nextInt(30030) + 1;
        }
        System.out.println(solution(list));

    }
}
