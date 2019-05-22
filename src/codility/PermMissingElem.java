package codility;

import java.util.Arrays;

public class PermMissingElem {

    public static int solution(int[] arr) {
        long sum = arr.length + 1;
        long total = sum * (sum + 1) / 2;

        for (int i :arr) {
            total -= i;
        }
        return (int)total;
    }

    public static void main(String[] args) {
        int[] arr1 = {7,4,5,6,2,3};
        int[] arr2 = {2,3,1,5};
        int[] arr3 = {};
        int[] arr4 = {3};
        int[] arr5 = {2};
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
        System.out.println(solution(arr3));
        System.out.println(solution(arr4));
        System.out.println(solution(arr5));
    }
}
