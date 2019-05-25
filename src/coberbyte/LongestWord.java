package coberbyte;

//coderbyte challenges

public class LongestWord {


    public static String longestWord(String sen) {
        String[] arrayString = sen.split("[^A-Za-z0-9]");
        String word = null;
        int length = 0;

        for (String value : arrayString ) {
            if ( value.length() > length ) {
                length = value.length();
                word = value;
            }
        }

        return word;
    }

    public static void main(String[] args) {
        String word =  "How Are you today?";
        System.out.println(longestWord(word));
    }
}
