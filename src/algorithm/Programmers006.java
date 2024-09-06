package algorithm;

import org.graalvm.collections.Pair;

import java.util.*;


public class Programmers006 {

    static int m = 4;
    static int n = 3;
    static int[][] puddles = {{2, 2}};
    static int[][] puddle = new int[m][n];

    public static void main(String[] args) {
        for (int[] i : puddles) {
            puddle[i[0]-1][i[1]-1] = 1;
        }

        int answer = 0;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        while (!q.isEmpty()) {
            int x = q.peek()[0];
            int y = q.poll()[1];

            if (x == m - 1 && y == n - 1) {
                answer++;
                continue;
            }
            for (int[] i : new int[][]{{1, 0}, {0, 1}}) {

                int nx = x + i[0];
                int ny = y + i[1];

                if (nx >= m || ny >= n || puddle[nx][ny] ==1) continue;
                q.add(new int[]{nx, ny});

            }
        }

        System.out.println(answer);
    }
}
