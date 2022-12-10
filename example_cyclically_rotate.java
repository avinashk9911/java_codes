// rotate the given array by one position in clock-wise direction

// this code is good but it is good only if we have to move one position
// this code is written by me

// the most effective code are written in this file only and you can find
// them by the name of 1) cyclically_rotate_array_by_one_2.java 
//                     2) cyclically_rotate_array_by_one.java

public class example_cyclically_rotate {
    public static void main(String[] args) {
        int n[] = { 1, 2, 3, 4, 5 };

        for (int i = n.length - 1; i > 0; i--) {
            int temp = n[i];
            n[i] = n[i - 1];
            n[i - 1] = temp;
        }

        for (

                int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
}