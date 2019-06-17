package hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] arr) {
        Arrays.sort(arr);
        for ( int i = 0; i < arr.length; i++ ) {
            System.out.println(arr[i]);
        }

        int count = 0;
        int total = 0;
        int i = 0;
        int start = arr[i];
        boolean continua = true;
        while ( continua ) {
           if ( start != arr[i] ) {
                total = total + ( count / 2);
                count = 1;
                start = arr[i];
            } else {
                count++;
            }
            i++;
            if (i == arr.length) {
                total = total + ( count / 2);
                continua = false;
            }
        }

        return total;
    }

    public static void main(String[] args) throws IOException {
        int n = 30;
        int[] arr = new int[n];
        int count = 0;
        while ( count < n ) {
            arr[count] = new Random().nextInt(5);
            count++;
        }

        System.out.println(sockMerchant(arr.length,arr));
    }

}
