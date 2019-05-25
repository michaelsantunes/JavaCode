package others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OrderList {

    public static List<Integer> solutionOne(List<Integer> integerList) {
        return integerList.stream().sorted().collect(Collectors.toList());
    }

    public static List<Integer> solutionTwo(List<Integer> integerList ) {
        for ( int i = 0; i < integerList.size(); i++) {
            for ( int x = 0; x < integerList.size(); x++ ) {
                if ( integerList.get(i) < integerList.get(x) ) {
                    int aux = integerList.get(i);
                    integerList.set(i, integerList.get(x));
                    integerList.set(x, aux);
                }
            }
        }

        return integerList;
    }

    public static void main(String[] args) {
        System.out.println("ONE: " + solutionOne(new ArrayList<Integer>(Arrays.asList(3,40,21,402,193,281,4039,12,1,49,58,20,2,3,5,2))));
        System.out.println("TWO: " + solutionTwo(new ArrayList<Integer>(Arrays.asList(3,40,21,402,193,281,4039,12,1,49,58,20,2,3,5,2))));
    }
}


