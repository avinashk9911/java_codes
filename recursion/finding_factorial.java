import javax.management.StandardEmitterMBean;

import java.util.*;

public class finding_factorial {
    public static void main(String[] args) {

        System.out.print("enter your number: ");
        Scanner sc = new Scanner(System.in);
        int int1 = sc.nextInt();

        int factorial = find_factorial(int1);
        System.out.println(factorial);

    }

    public static int find_factorial(int a) {
        if (a == 1) {
            return 1;
        }

        int factorial = a * find_factorial(a - 1);
        return factorial;
    }

}
