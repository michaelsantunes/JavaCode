package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class OddNumbers {

    // Complete the oddNumbers function below.
    static List<Integer> oddNumbers(int l, int r) {
        List<Integer> integerList = new ArrayList<>();

        while ( l <= r) {
            if ( l % 2 != 0 ) {
                integerList.add(l);
            }
            l++;
        }

        return integerList;
    }


    public static void main(String[] args) {

        System.out.println(oddNumbers(4, 31));

    }
}
