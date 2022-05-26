import java.util.*;

public class bit_manupulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("give your binary number= ");
        int num = sc.nextInt();

        System.out.println("choolse one of these (choose there respective number)");
        System.out.println("1) To GET \n2) To SET  \n3) To Clear");
        int x = sc.nextInt();
        if (x == 1) {
            Get_bit(num);
        } else if (x == 2) {
            set_bit(num);
        } else if (x == 3) {
            clear_bit(num);
        } else {
            System.out.println("Choose the correct option");
        }

    }

    public static void Get_bit(int a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the poistion value");
        int poistion = sc.nextInt();
        int bit_mask = 1 << poistion;
        int actualnum = bit_mask & a;
        if (actualnum == 0) {
            System.out.println("At this position the bit was: " + 1);
            return;
        } else {
            System.out.println("At this position the bit was: " + 0);
        }
        System.out.println(actualnum);
        return;
    }

    public static void set_bit(int a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("give the position at which you want to set: ");
        int position = sc.nextInt();
        int bit_mask = 1 << position;
        int actualnum = bit_mask | a;
        System.out.println(actualnum);
        return;
    }

    public static void clear_bit(int a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give the position where you want to clear= ");
        int position = sc.nextInt();
        int bit_mask = 1 << position;
        bit_mask = ~(bit_mask);
        int actualnum = bit_mask & a;
        System.out.println(actualnum);
        return;
    }

}
