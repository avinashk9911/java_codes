public class find_target_in_sorted_matrix {
    public static void main(String[] args) {

        int mat[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int n = 4;
        int x = 37;
        search(mat, n, x);

    }

    public static void search(int[][] mat, int n, int x) {

        int row = 0;
        int colunm = n - 1;
        while (row < n && colunm >= 0) {
            if (mat[row][colunm] == x) {
                System.out.printf("the given target is found at location %d,%d", row, colunm);
                return;
            } else if (mat[row][colunm] < x) {
                row += 1;
            } else {
                colunm -= 1;
            }
        }
        System.out.println("target not found!");
        return;

    }

}
