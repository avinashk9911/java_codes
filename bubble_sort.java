import java.util.*;

public class bubble_sort {

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + "->");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 8, 3, 4, 9 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printarr(arr);
    }
}
