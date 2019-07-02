package hackerrank;

import java.util.*;

public class RepeatedString {


    static long repeatedString(String s, long n) {
        long count = 0L;
        char find  = 'a';

        String[] array = s.split("");
        count = Arrays.stream(array).filter(c-> c.equals("a")).count();

        count = count * (n / (long) s.length());

        long rest = n % (long) s.length();

        for ( int x = 0; x < rest; x++ ) {
            if ( s.charAt(x) == find) {
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args) {
        String s = "xaaaa";
        long n = 970770L;
        //String s = "aba";
        //long n = 10;
        System.out.println(repeatedString(s,n));

         int x = 0;

        if ( 1 <= x) {

        }
    }
}

//abcacabcac
//abcacabcac


