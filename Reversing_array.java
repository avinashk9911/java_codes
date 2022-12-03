public class Reversing_array {
    public static void main(String[] args) {
        int a[] = { 5, 4, 3, 2, 1 };

        int i = 0, j = a.length - 1;

        while (i <= j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }

        for (int x = 0; x < a.length; x++) {
            System.out.print(a[x] + " ");
        }
    }
}
