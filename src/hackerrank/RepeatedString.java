package hackerrank;

import java.util.*;

public class RepeatedString {

    static long repeatedString(String s, long n) {

        if ( s.length() == 1 )
            return n;
        long count = 0;
        for ( int i = 0; i < s.length(); i++) {
            if ( String.valueOf(s.charAt(i)).equalsIgnoreCase("a") ) {
                count++;
            }
        }

        int index = 0;
        for ( int x = s.length(); x < n; x++) {
            if ( String.valueOf(s.charAt(index)).equalsIgnoreCase("a") ) {
                count++;
            }
            index++;
            if ( index >= s.length() )
                index = 0;

        }

        return count;
    }


    public static void main(String[] args) {
//        String s = "babbaabbabaababaaabbbbbbbababbbabbbababaabbbbaaaaabbaababaaabaabbabababaabaabbbababaabbabbbababbaabb";
//        long n = 860622337747L;
        String s = "aba";
        long n = 10;
        System.out.println(repeatedString(s,n));

         int x = 0;

        if ( 1 <= x) {

        }
    }
}

//abcacabcac
//abcacabcac


