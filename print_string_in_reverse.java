// we are useing recursion technique to print a string in reverse order
// time complexity is O(n)
// this question has beed explaind in lecture: 18 of java placement course

public class print_string_in_reverse {
    public static void main(String[] args) {

        String str = "abcd";
        int length = str.length() - 1;

        printstring(str, length);

    }

    public static void printstring(String str, int length) {
        if (length == 0) {
            System.out.print(str.charAt(length) + " ");
            return;
        }

        else {
            System.out.print(str.charAt(length) + " ");
            printstring(str, length - 1);
        }

    }
}
