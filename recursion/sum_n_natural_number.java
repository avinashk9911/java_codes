import java.util.Scanner;

public class sum_n_natural_number {
    public static void main(String args[]) {

        System.out.println("give a natural number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        printsum(n, sum);

    }

    public static void printsum(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sum += n;
        printsum(n - 1, sum);
    }

}