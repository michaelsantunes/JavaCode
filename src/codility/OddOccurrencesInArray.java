package codility;

import java.util.Arrays;

public class OddOccurrencesInArray {

    public static int solution(int[] A) {
        int[] arrayInteger = A;
        Arrays.sort(arrayInteger);
        int aux = arrayInteger[0];
        int count = 0;
        for ( int i = 0; i < arrayInteger.length; i++) {
            int value= arrayInteger[i];
            if ( aux == value ) {
                count++;
            } else {
                if ( (count == 0) || (count % 2 == 1) ) {
                    break;
                } else {
                    aux = value;
                    count = 1;
                }
            }
        }

        return aux;
    }

    public static void main(String[] args) {

        int[] a = {9,3,9,3,9,7,9,7,8,8,8,7,1,2,4,1,2,4};
        System.out.println(solution(a));


    }
}
