public class kadanes_algorithm {
    public static void main(String[] args) {
        int n[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int size = n.length;

        System.out.println("the maximum sum of a costring is: " + kadanes(n, size));
    }

    public static int kadanes(int n[], int size) {

        int max = n[0];
        int curr_max = 0;
        for (int i = 0; i < size; i++) {
            curr_max = curr_max + n[i];
            max = curr_max > max ? curr_max : max;
            if (curr_max < 0) {
                curr_max = 0;
            }
        }
        return max;
    }
}
