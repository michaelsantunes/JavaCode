package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int count = 0;
        List<Integer> result = new ArrayList<>(Arrays.asList(0,0));
        while ( count < a.size() ) {
            if ( a.get(count) != b.get(count) ) {
                if ( a.get(count) > b.get(count) ) {
                    result.set(0,result.get(0) + 1);
                } else {
                    result.set(1,result.get(1) + 1);
                }
            }
            count++;
        }

        return result;
    }


    public static void main(String[] args) {
        List<Integer> alice = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> bob = new ArrayList<>(Arrays.asList(3, 2, 1));
        List<Integer> result = compareTriplets(alice,bob);
        System.out.println("Alice = " + result.get(0) + " Bob = " +  result.get(1));
    }
}
