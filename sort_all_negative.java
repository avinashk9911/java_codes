// write a code which will sort all -ve numbers to the left and all the +ve number to right

// this question has been solved by me

import java.util.*;

public class sort_all_negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("give the size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("give the value for index: ");
            a[i] = sc.nextInt();
        }

        // sort all negative number to there right

        int i = 0, j = n - 1;
        while (i <= j) {
            if (a[i] < 0) {
                i++;
            } else if (a[i] >= 0 & a[j] < 0) {
                int x = a[i];
                a[i] = a[j];
                a[j] = x;
                i++;
                j--;
            }

            else { // if(a[i]>=0 & a[j]>=0){
                j--;
            }
        }

        for (int k = 0; k < n; k++) {
            System.out.println(a[k]);
        }
    }
}
