package codility;

public class GenomicRangeQuery {

    public static int[] solution(String S, int[] P, int[] Q) {
        //"A","C","G","T";
        int max = P.length;
        int[] result = new int[max];
        int index = 0;
        int indexAux = 0;

        String[] split = S.split("");

        while (index < max) {
            int indexP = P[index];
            int indexQ = Q[index];
            if (indexP <= indexQ) {
                String letter = null;
                if (indexP == indexQ) {
                    letter = String.valueOf(S.charAt(indexP));
                } else {
                    letter = S.substring(indexP, indexQ+1);
                }
                String lastLetter = String.valueOf(letter.charAt(letter.length() - 1));
                if ("A".equalsIgnoreCase(lastLetter)) {
                    result[indexAux] = 1;
                } else if ("C".equalsIgnoreCase(lastLetter)) {
                    result[indexAux] = 2;
                } else if ("G".equalsIgnoreCase(lastLetter)) {
                    result[indexAux] = 3;
                } else if ("T".equalsIgnoreCase(lastLetter)) {
                    result[indexAux] = 4;
                }
                indexAux++;
            }

            index++;
        }

        return result;
    }


        //
        /*
            0  1  2  3  4  5  6
            C  A  G  C  C  T  A

            P[0] = 2     Q[0] = 4
            P[1] = 5     Q[1] = 5
            P[2] = 0     Q[2] = 6

            P[0] = 2 = G      Q[0] = 4 =  C   »» 2

            P[1] = 5 = T      Q[1} = 5  = T   »»  4

            P[2] = 0 = C      Q[2] = 6 =  A »» 1



           the function should return the values [2, 4, 1], as explained above.


        */

    public static void main(String[] args) {
        int[] A = solution("CAGCCTAAATTGGAATT", new int[]{0, 5, 0, 3, 4, 5}, new int[]{1, 5, 6, 4, 1, 2}) ;
        int[] B = solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6});
//        for ( int i = 0; i < A.length; i++) {}
//            System.out.printf(" " + A[i]);
//        }


        //For example, for the input ('AC', [0, 0, 1], [0, 1, 1]) the solution returned a wrong answer
        // (got [1, 2, 2] expected [1, 1, 2]).
    }
}
