package algorithm;

public class Programmers003 {

    static int[][] computers = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
    static int[] visited = new int[300];
    static int n =3;
static int answer =0;

    public static void main(String[] args) {

        for (int i = 0; i < computers.length; i++) {
            if (visited[i] == 0) {
                visited[i] = 1;
                BFS(i);
                answer++;
            }
        }

        System.out.println(answer);

    }

    public static void BFS(int i){ //i번 컴퓨터와 연결되어있는 컴퓨터 방문
        for (int j = 0; j < computers.length; j++) {
            if (visited[j] == 0 && computers[j][i] ==1) { //방문하지 않았고 연결되어있다면 방문

                visited[j] =1;
                BFS(j);

            }
        }

    }


}
