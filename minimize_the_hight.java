public class minimize_the_hight {
    public static void main(String[] args) {
        int k = 3;
        int arr[] = { 3, 9, 12, 16, 20 };

        int max = arr[0];
        int min = arr[0];

        int n = 0;
        while (n < arr.length) {
            if (arr[n] <= k) {
                arr[n] += k;
                if (arr[n] > max) {
                    max = arr[n];
                } else {
                    min = arr[n];
                }

            } else {
                arr[n] -= k;
                if (arr[n] > max) {
                    max = arr[n];
                } else {
                    min = arr[n];
                }
            }

            n += 1;
        }

        System.out.println("the max is: " + max + " the min is: " + min);

        System.out.println("the difference is: " + (max - min));
    }

}
