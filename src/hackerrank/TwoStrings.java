package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoStrings {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        for ( int i = 0; i < s1.length(); i++ ) {
            for ( int x = 0; x < s2.length(); x++) {
                if ( s1.charAt(i) == s2.charAt(x)) {
                    return "YES";
                }
            }
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println(twoStrings("OLA", "tUdoBem"));
    }


}
