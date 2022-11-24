// given an array which only contains 0,1 and 2 without using any sorting algorithm

// HINT:
// always keep eye on the middle(i.e. i) index 
// what you will do if the the middle index have value 1 or 2 or 0

import java.util.Scanner;

public class sort_0_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("give the size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("give the value for index: ");
            a[i] = sc.nextInt();
        }

        // sort 0, 1, 2
        sortinteget(a, n);

        // printing sorted array
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

    public static void sortinteget(int a[], int n) {

        int i = 0, j = 0, k = n - 1;
        while (i <= k) {
            if (a[i] == 0) {
                int x = a[i];
                a[i] = a[j];
                a[j] = x;
                i++;
                j++;

            } else if (a[i] == 1) {
                i++;
            }

            else if (a[i] == 2) {
                int x = a[i];
                a[i] = a[k];
                a[k] = x;
                k--;
            }
        }

    }
}
