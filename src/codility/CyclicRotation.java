package codility;

import java.util.Collections;

public class CyclicRotation {

    public static int[] solution(int[] A, int K) {
        int [] arrayAux = A;
        int [] array    = new int[arrayAux.length];
        int k = K;
        for ( int i = 0; i < arrayAux.length; i++) {
            int position = i + k;
            int count = arrayAux.length;
            int index = 0;
            if ( position < count ) {
                index = position;
            } else {
                while (position > count) {
                    count++;
                    if ( ( index + 1) < arrayAux.length ) {
                        index++;
                    } else {
                        index = 0;
                    }
                }
           }

            array[index] = arrayAux[i];
        }
        return array;
    }

    public static void main(String[] args) {
        int[] integers = {3,6,4,2};
        System.out.println(solution(integers,3));
    }
}
