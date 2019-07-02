package codility;

import java.util.*;

public class MaxCounters {

/*
    You are given N counters, initially set to 0, and you have two possible operations on them:

    increase(X) − counter X is increased by 1,
    max counter − all counters are set to the maximum value of any counter.
    A non-empty array A of M integers is given. This array represents consecutive operations:
   if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
   if A[K] = N + 1 then operation K is max counter.
    For example, given integer N = 5 and array A such that:

    A[0] = 3
    A[1] = 4
    A[2] = 4
    A[3] = 6
    A[4] = 1
    A[5] = 4
    A[6] = 4
    the values of the counters after each consecutive operation will be:
            (0, 0, 1, 0, 0)
            (0, 0, 1, 1, 0)
            (0, 0, 1, 2, 0)
            (2, 2, 2, 2, 2)
            (3, 2, 2, 2, 2)
            (3, 2, 2, 3, 2)
            (3, 2, 2, 4, 2)
    The goal is to calculate the value of every counter after all operations.
    Write a function:
    class Solution { public int[] solution(int N, int[] A); }
    that, given an integer N and a non-empty array A consisting of M integers, returns a sequence of integers representing the values of the counters.
    Result array should be returned as an array of integers.
    For example, given:
    A[0] = 3
    A[1] = 4
    A[2] = 4
    A[3] = 6
    A[4] = 1
    A[5] = 4
    A[6] = 4
    the function should return [3, 2, 2, 4, 2], as explained above.
    Write an efficient algorithm for the following assumptions:
    N and M are integers within the range [1..100,000];
    each element of array A is an integer within the range [1..N + 1].

   if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
   if A[K] = N + 1 then operation K is max counter.
*/

    public static int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int maxCounter = 0;
        for ( int i = 0; i < A.length; i++ ) {
            int X = A[i];
            if ( X <= N ) {
               counters[X-1] = counters[X-1] + 1;
               if ( counters[X-1] > maxCounter ) {
                   maxCounter = counters[X-1];
               }
            } else {
                Arrays.fill(counters,maxCounter);
            }
        }
        return counters;
    }

    public static void timeComplexity() {
        int max = 1000000;
        System.out.println("MAX REG         = " + max);
        int[] array = new int[max];
        for ( int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(max);
        }

        long startTime = new Date().getTime();
        int count = Arrays.stream(array).sum();
        long finalTime = new Date().getTime();
        System.out.println("SUM WITH STREAM = " + count + " TIME = " + (finalTime - startTime) );

        int sum = 0;
        startTime = new Date().getTime();
        for ( int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        finalTime = new Date().getTime();

        System.out.println("SUM WITH FOR    = " + sum + " TIME = " + (finalTime - startTime) );

        int[] withStream = new int[max];
        startTime = new Date().getTime();
        Arrays.setAll(withStream, x->1);
        finalTime = new Date().getTime();
        System.out.println("SET WITH STREAM = " + count + " TIME = " + (finalTime - startTime) );

        int[] withFor = new int[max];
        startTime = new Date().getTime();
        for ( int j = 0; j <withFor.length; j++ ) {
            withFor[j] = 1;
        }
        finalTime = new Date().getTime();
        System.out.println("SET WITH FOR    = " + count + " TIME = " + (finalTime - startTime) );

        /*
            MAX REG         = 1000000
            SUM WITH STREAM = 1452111569 TIME = 9
            SUM WITH FOR    = 1452111569 TIME = 7
            SET WITH STREAM = 1452111569 TIME = 5
            SET WITH FOR    = 1452111569 TIME = 4
        */




    }



    //max = Arrays.stream(values).max().getAsInt();
    //Arrays.setAll(values, x -> maxValue);

    public static void main(String[] args) {
        int[] A = {3,4,4,6,1,4,4};
        int N = 5;
        int[] R = solution(N,A);
        for (int i = 0; i < R.length; i++ ) {
            System.out.printf(" " + R[i]);
        }






    }





}
