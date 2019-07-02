package hackerrank;

import java.math.BigInteger;

public class JumpingOnTheClouds {

    static int jumpingOnClouds(int[] c) {
        int index = 0;
        int count = 0;
        while ( c.length  > index ) {
            if (((index + 2) < c.length) && (c[index + 2] == 0)) {
                count++;
                index = index + 2;
            } else if (((index + 1) < c.length) && ((c[index + 1] == 0))) {
                count++;
                index = index + 1;
            } else {
                index++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] c = {0,1,0,0,0,1,0};
        jumpingOnClouds(c);
        int[] d = {0,0,0,0,1,0};
        jumpingOnClouds(d);
    }
}
