//print pattern

// 1
// 2 3
// 4 5 6
// 7 8 9 1 0
// 11 12 13 15

public class print_pattern6 {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(count + ' ');
                count++;
            }
            System.out.println();
        }
    }
}
