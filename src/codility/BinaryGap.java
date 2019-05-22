package codility;

import java.util.*;

public class BinaryGap {
    public static int solution(int N) {
        String binary = Integer.toBinaryString(N);
        int zero  = 0;
        int moreThanOne = 0;
        int acc = 0;
        for ( int i = 0; i < binary.length(); i++) {
            char cc = binary.charAt(i);
            if ( cc == '1') {
                zero = 0;
                moreThanOne++;
            }
            if ( cc == '0') {
                for ( int x = i; x < binary.length(); x++ ) {
                    if ( (x+1) < binary.length() && binary.charAt(x+1) == '1' ) {
                        zero++;
                        break;
                    }
                }
                if ( zero > acc ) {
                    acc = zero;
                } else if ( zero == 0 ) {
                    break;
                }
            }
        }

        if ( moreThanOne == 1)
            return 0;
        return acc;
    }


    public static void main(String[] args) {
        int[] test = {51712, 561892, 39209, 1231, 98102,4332,1029, 32, 493902, 1028991, 399201};
        for (Integer n : test ) {
            System.out.println(solution(n));
        }
    }
}
