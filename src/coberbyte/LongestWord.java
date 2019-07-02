package coberbyte;

public class LongestWord {

    /*
    Have the function LongestWord(sen) take the sen parameter being passed and return the largest word in the string.
    If there are two or more words that are the same length, return the first word from the string with that length.
    Ignore punctuation and assume sen will not be empty.
    Use the Parameter Testing feature in the box below to test your code with different arguments.
     */

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
