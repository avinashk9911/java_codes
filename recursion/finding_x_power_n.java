import java.util.*;

public class finding_x_power_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give a number: ");
        int x = sc.nextInt();
        System.out.println("give a power: ");
        int n = sc.nextInt();
        System.out.println("the power of x will be: " + find_power(x, n));
        return;
    }

    public static int find_power(int x, int n) {
        if (n == 1) {
            System.out.println("hear the output ends: ");
            return x;
        } else {
            x *= find_power(x, n - 1);
        }
        return x;
    }

}
