package codility;

import java.util.*;

public class PermCheck {

/*
    A non-empty array A consisting of N integers is given.

    A permutation is a sequence containing each element from 1 to N once, and only once.

    For example, array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
    is a permutation, but array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    is not a permutation, because value 2 is missing.

    The goal is to check whether array A is a permutation.

    Write a function:

    class Solution { public int solution(int[] A); }

    that, given an array A, returns 1 if array A is a permutation and 0 if it is not.

    For example, given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
    the function should return 1.

    Given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    the function should return 0.

    Write an efficient algorithm for the following assumptions:

    N is an integer within the range [1..100,000];
    each element of array A is an integer within the range [1..1,000,000,000].
*/


    public static int solution(int[] A) {
        Arrays.sort(A);
        int index = 0;
        int count = 1;
        while ( A.length > index ) {
            int value = A[index];
            if ( value != count)
                return 0;
            index++;
            count++;
        }
        return 1;
    }
    public static void main(String[] args) {
        Set<Integer> list = new HashSet<>();
        for (int i = 0; i < 1; i++) {
            list.add(new Random().nextInt(40));
        }

        int[] A = new int[list.size()];
        int index = 0;
        for (Integer value : list) {
            A[index] = value;
            index++;
        }
        System.out.println(solution(A));
    }
 }
