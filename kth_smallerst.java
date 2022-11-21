//find kth smallest element in an array
// taken help form the 'Anuj Bhaiya: youtube: DSA-One Course#33'

import java.util.*;

public class kth_smallerst {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number[] = { 7, 10, 4, 3, 20, 15, 5 };
        int k = 3;

        k = number.length - k + 1;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(number[i]);
        }

        for (int i = k; i < number.length; i++) {
            if (pq.peek() < number[i]) {
                pq.poll();
                pq.add(number[i]);
            }
        }

        System.out.println(pq.peek());
    }
}
