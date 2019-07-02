package hackerrank;

public class Staircase {

    static void staircase(int n) {
        String stairs = "";
        String space  = "";
        for ( int i = 0; i < n; i++ ) {
            space = space + " ";
        }
        for ( int i = 0; i < n; i++ ) {
            space = space.substring(0,space.length()-1);
            stairs = stairs + "#";
            if ( i == 0 ) {
                System.out.println(space + stairs);
            } else {
                System.out.println(space + stairs);
            }
        }
    }

    public static void main(String[] args) {
        int v = 6;
        staircase(v);
    }
}
