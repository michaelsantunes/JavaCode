package others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestDifferenceBetweenNumbers {

    static void solution1(List<Integer> integerList) throws Exception {
        Collections.sort(integerList);
        int first = integerList.get(0);
        int last  = integerList.get(integerList.size()-1);
        int diff = last - first;
        System.out.println("Diff Solution 1: " + diff);
    }

    static void solution2(List<Integer> integerList) {
        int diff = 0;
        for ( int i = 1; i < integerList.size() ; i++ ) {
            for ( int j = 0; j < integerList.size(); j++ ) {
                if ( Math.abs(integerList.get(i) - integerList.get(j)) > diff) {
                    diff = Math.abs(integerList.get(i) - integerList.get(j));
                }
            }
        }
        System.out.println("Diff Solution 2: " + diff);
    }



    public static void main(String[] args) throws Exception {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(20,50,30,10,90,80,813,102));
        solution1(integerList);
        solution2(integerList);
    }
}
