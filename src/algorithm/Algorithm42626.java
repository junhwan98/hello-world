package algorithm;

import java.util.PriorityQueue;

public class Algorithm42626 {

    public static void main(String[] args) {

        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : scoville) {
            pq.add(i);
        }
        while (pq.peek() <= 7) {
            if (pq.size() == 1) {
            answer = -1;
            break;
            }
            pq.add(pq.poll() + (pq.poll() * 2));
            answer++;

        }

        System.out.println(answer);
    }
}
