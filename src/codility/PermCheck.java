package codility;

import java.util.Arrays;

public class PermCheck {

    public static int solution(int[]arr) {
        if ( arr.length == 0 || ( arr.length == 1 && arr[0] > 1) )
            return 0;
        Arrays.sort(arr);
        for ( int i = 0; i < arr.length; i++ ) {
            int v1 = arr[i];
            if ( (i + 1) < arr.length ) {
                int sum = v1 + 1;
                int v2  = arr[i+1];
                if ( v1 == v2 || sum < v2) {
                    return 0;
                }
            }
        }
        return 1;
    }


    public static void main(String[] args) {
        int[] arr1 = {7,4,5,6,2,3,3};
        int[] arr2 = {2,3,1,5};
        int[] arr3 = {};
        int[] arr4 = {3,2,4,5,6,7,8};
        int[] arr5 = {2};
        int[] arr6 = {1};
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
        System.out.println(solution(arr3));
        System.out.println(solution(arr4));
        System.out.println(solution(arr5));
        System.out.println(solution(arr6));
    }
}
