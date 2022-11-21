// program to reverse an array or string//

import java.util.*;

public class reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("give the size of an array: ");
        int num = sc.nextInt();
        int number[] = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("give index value: ");
            number[i] = sc.nextInt();

        }

        // reversing a string

        int i = 0;
        int j = number.length - 1;
        while (i < j) {
            int x = number[i];
            number[i] = number[j];
            number[j] = x;
            i++;
            j--;
        }

        for (int x = 0; x < number.length; x++) {
            System.out.println(number[x]);
        }
    }
}