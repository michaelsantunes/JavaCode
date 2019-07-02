package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class DiagonalDifference {

    //Given a square matrix, calculate the absolute difference between the sums of its diagonals.

    public static int diagonalDifference(List<List<Integer>> arr) {

        int maxIndex = 0;
        for ( List<Integer> list : arr ) {
            if ( list.size() > maxIndex ) {
                maxIndex = list.size();
            }
        }

        int maxLeft = 0;
        int index = 0;
        for (List<Integer> list : arr ) {
            if ( maxIndex == list.size() && index < list.size() ) {
                maxLeft += list.get(index);
                index++;
            }
        }

        int maxRight = 0;
        index = maxIndex-1;
        for (List<Integer> list : arr ) {
            if ( maxIndex == list.size() && index >= 0 ) {
                maxRight += list.get(index);
                index--;
            }
        }


        return Math.abs(maxLeft - maxRight);
    }

    public static void main(String[] args) {

        //first
        List<List<Integer>> lists = new ArrayList<>();
        List aux = new ArrayList(Arrays.asList(1, 2, 3));
        lists.add(aux);
        aux = new ArrayList(Arrays.asList(4, 5, 6));
        lists.add(aux);
        aux = new ArrayList(Arrays.asList(9, 8, 9));
        lists.add(aux);
        System.out.println("F1 = " + diagonalDifference(lists));

        //second
        lists = new ArrayList<>();
        aux = new ArrayList(Arrays.asList(3));
        lists.add(aux);
        aux = new ArrayList(Arrays.asList(11, 2, 4));
        lists.add(aux);
        aux = new ArrayList(Arrays.asList(4, 5, 6));
        lists.add(aux);
        aux = new ArrayList(Arrays.asList(10, 8, -12));
        lists.add(aux);
        System.out.println("F2 = " + diagonalDifference(lists));
    }
}
