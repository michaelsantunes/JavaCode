package hackerrank;

public class PlusMinus {

    static void plusMinus(int[] arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for ( int value : arr) {
           if ( value > 0 ) {
               positive++;
           } else if ( value < 0) {
               negative++;
           } else {
               zero++;
           }
        }

        float p = (float) positive / arr.length;
        float n = (float) negative / arr.length;
        float z = (float) zero / arr.length;

        System.out.printf(p + "\n" + n + "\n" + z + "\n");
    }

    public static void main(String[] args) {
        int[] array = {-4, 3, -9, 0, 4, 1 };
        plusMinus(array);

    }

}
