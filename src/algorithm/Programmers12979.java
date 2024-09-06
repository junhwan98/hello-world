package algorithm;

public class Programmers12979 {
    public static void main(String[] args) {

        int n = 16;
        int[] stations = {9};
        int w = 2;
        int[] connected = new int[n];
        int answer = 0;
        for (int i : stations) {
            for (int j = i - 1 - w; j < i + w; j++) {
                if (j < 0 || n - 1 < j) continue;
                connected[j] = 1;
            }
        }

        for (int i = 0; i < n; i++) {

            if (connected[i] == 0) {

                answer ++;
                i += 2*w;

            }
        }

        System.out.println(answer);

    }
}
