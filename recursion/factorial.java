import java.util.Scanner;

public class factorial {
    public static void main(String args[]) {
        System.out.print("give your number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fact = 1;

        printfact(n, fact);
    }

    public static void printfact(int n, int fact) {
        if (n <= 0) {
            System.out.println(fact);
            return;
        }
        fact *= n;
        printfact(n - 1, fact);
    }
}
