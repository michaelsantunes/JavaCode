package codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

    /*

    Write a function:

    class Solution { public int solution(int[] A); }

    that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

    For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

    Given A = [1, 2, 3], the function should return 4.

    Given A = [−1, −3], the function should return 1.

    Write an efficient algorithm for the following assumptions:

    N is an integer within the range [1..100,000];
    each element of array A is an integer within the range [−1,000,000..1,000,000].

    */

    public static int solution(int[] A ) {
        Arrays.sort(A);
        int count = 0;
        int index = 0;
        while ( A.length > index ) {
            if ( A[index] > 0 ) {
                int i = A[index];
                int x = 0;
                if ( (index + 1) < A.length ) {
                    x = A[index+1];
                }
                if ( i != x ) {
                    if ( ++count != i ) {
                        return count;
                    }
                }
            }
            index++;
        }

        return count + 1;
    }

    public static void main(String[] args) {
        int[] A = {-1,-3,-4,-5,-6,-7,-9};
        System.out.println(solution(A));
    }
}
