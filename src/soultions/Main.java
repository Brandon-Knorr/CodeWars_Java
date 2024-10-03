package soultions;

public class Main {
    public static void main(String[] args) {

    }

    /*
    Sentence Smash
    - Write a function that takes an array of words and smashes them together into a sentence and returns the sentence.
    - Be careful, there shouldn't be a space at the beginning or the end of the sentence!
     */

    public static String smash(String... words) {
        return String.join(" ", words);
    }



    /*
    Convert a Boolean to a String
    - Implement a function which convert the given boolean value into its string representation.
     */

    public static String convert(boolean b) {
        if (b == true) {
            return "true";
        }
        return "false";
    }



    /*
    Convert a Number to a String!
    - We need a function that can transform a number (integer) into a string.
    */

    public static String numberToString(int num) {
        return String.format("%d", num);
    }



    /*
    Count by X
    -Create a function with two arguments that will return an array of the first n multiples of x.
    -Assume both the given number and the number of times to count will be positive numbers greater than 0.
    -Return the results as an array or list.
    */

    public static int[] countBy(int x, int n){
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = x * (i + 1);
        }
        return result;
    }

}
