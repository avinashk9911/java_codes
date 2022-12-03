// cyclically rotate an array by one

// method-1

public class cyclically_rotate_array_by_one {

    public static void main(String[] args) {
        int n[] = { 2, 3, 1, 5, 7, 6 };

        int temp = n[n.length - 1];

        for (int i = n.length - 1; i > 0; i--) {
            n[i] = n[i - 1];

        }

        n[0] = temp;

        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
}
