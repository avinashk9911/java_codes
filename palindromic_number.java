import java.util.*;

public class palindromic_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number: ");
        int n = sc.nextInt();

        int originalNumber = n;
        int revers = 0;
        int reminder = 0;

        while (n != 0) {
            reminder = n % 10;
            revers = revers * 10 + reminder;
            n /= 10;
        }

        if (originalNumber == revers) {
            System.out.println("the number is palindrom! ");
        } else {
            System.out.println("The number is not palindrom! ");
        }

    }
}
