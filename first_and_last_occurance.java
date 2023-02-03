// by recursion we are finding the first and the last index of an character 
// occuring in a given string

// this code is written by me
// you will find the question in lecture number: 18 of java placement course

public class first_and_last_occurance {
    public static void main(String[] args) {

        String str = "abaacdaefaah";
        char ch = 'a';
        int first = -1;
        int last = -1;
        int length = str.length() - 1;

        firstlast(str, length, first, last, ch);

    }

    public static void firstlast(String str, int length, int first, int last, char ch) {
        if (length < 0) {

            System.out.println("the last location is: " + last);
            System.out.println("the first location is: " + first);
            return;
        }

        if (str.charAt(length) == ch) {
            if (last == -1) {
                last = length;

            } else {
                first = length;
            }

        }

        firstlast(str, length - 1, first, last, ch);
    }
}
