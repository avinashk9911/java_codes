//find the maximum and the minimum element in the array

import java.util.*;

public class max_min {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("give the size of an array: ");
        int num = sc.nextInt();
        int number[] = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("give index value: ");
            number[i] = sc.nextInt();

        }

        // max and min

        int max = number[0];
        int min = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            } else if (number[i] < min) {
                min = number[i];
            }
        }

        System.out.println("the maximum number is " + max);
        System.out.println("the mimimum number is " + min);

    }
}
