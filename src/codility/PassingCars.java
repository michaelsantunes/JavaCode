package codility;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PassingCars {

    public static int solution(int[] A) {
        int zero  = 0;
        int count = 0;

        for ( int i = 0; i < A.length; i++ ) {
            if ( A[i] == 0)
                zero++;
            else if ( A[i] == 1)
                count += zero;
        }
        if ( count > 1000000000 ) return -1;

        return count;
    }

    public static void main(String[] args) {
        //1000000000
        int limit = 1000000;
        int A[] = new int[limit];
        for ( int i = 0; i < limit; i++) {
            A[i] = new Random().nextInt(2);
        }
        System.out.println(solution(A));
    }
}

