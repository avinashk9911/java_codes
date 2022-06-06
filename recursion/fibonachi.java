import java.util.Scanner;

public class fibonachi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("give the range of fibonachi: ");
        int n = sc.nextInt();

        System.out.print("give 1st natural number: ");
        int a = sc.nextInt();

        System.out.print("give 2nd natural number: ");
        int b = sc.nextInt();

        System.out.println(a);
        System.out.println(b);

        printfibonachi(a, b, n);
    }

    public static void printfibonachi(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int sum = a + b;
        System.out.println(sum);
        // a=b;
        // b=sum;
        printfibonachi(b, sum, n - 1);
    }
}
