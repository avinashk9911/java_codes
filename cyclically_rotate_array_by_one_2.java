// cyclically rotate an array by one

// method-2

public class cyclically_rotate_array_by_one_2 {
    public static void main(String[] args) {
        int n[] = { 2, 3, 1, 5, 7, 6 };

        int i = 0, j = n.length - 1;
        while (i != j) {
            int temp = n[j];
            n[j] = n[i];
            n[i] = temp;
            i++;
        }

        for (int x = 0; x < n.length; x++) {
            System.out.println(n[x]);
        }
    }
}
