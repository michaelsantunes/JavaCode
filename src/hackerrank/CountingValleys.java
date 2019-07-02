package hackerrank;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int up = 0;
        int down = 0;
        int valley = 0;
        String[] array = s.split("");

        for ( int i = 0; i < n; i++ ) {
            if ( array[i].equalsIgnoreCase("U") ) {
                up++;
            } else {
                down++;
            }
            if ( (up - down ) == 0 && array[i].equalsIgnoreCase("U")) {
                valley++;
            }
        }

        return valley;

    }

    public static void main(String[] args) {
        String sequence = "DDUUDDUDUUUD";
        System.out.println(countingValleys(sequence.length(), sequence));
    }
}
