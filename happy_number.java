// for reference //

//https://youtu.be/Egw03gI-Tf0//

import java.util.*;

public class happy_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Give a interger value to check: ");
        int n = sc.nextInt();

        Set<Integer> myset = new HashSet<>();

        while (true) {

            int sum = 0;
            while (n > 0) {

                int temp = n % 10;
                sum = sum + (temp * temp);
                n = n / 10;
            }

            System.out.println("sum " + sum);

            if (sum == 1) {
                System.out.println("it is a happy number");
                break;
            }

            else if (myset.contains(sum)) {
                System.out.println("the number is unhappy");
                break;
            }

            else {
                myset.add(sum);
                n = sum; // ***************most importent line ***************
            }

        }

    }
}