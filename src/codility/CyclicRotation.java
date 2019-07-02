package codility;

public class CyclicRotation {

/*
    An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index,
    and the last element of the array is moved to the first place. For example, the rotation of array
    A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).

    The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.
    Write a function:
    class Solution { public int[] solution(int[] A, int K); }
    that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.
    For example, given
    A = [3, 8, 9, 7, 6]
    K = 3
    the function should return [9, 7, 6, 3, 8]. Three rotations were made:
            [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
            [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
            [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
    For another example, given
    A = [0, 0, 0]
    K = 1
    the function should return [0, 0, 0]
    Given
    A = [1, 2, 3, 4]
    K = 4
    the function should return [1, 2, 3, 4]
    Assume that:

    N and K are integers within the range [0..100];
    each element of array A is an integer within the range [−1,000..1,000].
*/

    public static int[] solution(int[] A, int K) {

        if ( A.length == K || A.length == 1)
            return A;

        int count = 0;
        while ( K > count ) {
            int[] aux = new int[A.length];
            int index    = A.length - 1;
            int indexAux = 0;
            while ( indexAux < A.length -1) {
                if ( index == A.length - 1 ) {
                    aux[indexAux] = A[index];
                    index = 0;
                } else {
                    aux[++indexAux] = A[index++];
                }
            }
            A = aux;
            count++;
        }


        return A;
    }

    public static void main(String[] args) {
        int[] A = {9,3,2,1,4,5,7,1,2,34,2,3,4};
        A = solution(A, 5);
        for ( int i = 0; i < A.length; i++ ) {
            System.out.print(" " + A[i]);
        }
    }
}
