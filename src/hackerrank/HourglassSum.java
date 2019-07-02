package hackerrank;

import java.util.Random;

public class HourglassSum {


    public static int hourglassSum(int[][] arr ) {




        return 0;
    }


    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = new Random().nextInt(2);
            }
        }
    }
}
