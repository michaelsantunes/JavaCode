package hackerrank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheNumber {

    // Complete the findNumber function below.
    static String findNumber(List<Integer> arr, int k) {
        for ( Integer integer : arr ) {
            if ( k == integer ) return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) throws IOException {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(9,3,2,4,1,3,1,3,4,5,3,1,3,4,2));
        System.out.println(findNumber(integerList,13));
    }
}
