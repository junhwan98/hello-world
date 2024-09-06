package algorithm;

public class Algorithm12913 {
    public static void main(String[] args) {
        int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        int[][] visited = new int[land.length][4];
        for(int i =0; i<4 ; i++){
        visited[0][i] = land[0][i];
        }
        for(int i= 1 ; i<land.length ; i++){
            for(int j = 0 ; j <4 ; j++){
                for(int k = 0 ; k < 4; k++){
                    if(j == k) continue;
                    int n =visited[i-1][j]+land[i][k];
                    if(visited[i][k] < n){
                        visited[i][k] = n;
                    }
                }

            }
        }
        int answer = 0;
        for(int i= 0 ; i<4 ; i++){
            if(answer < visited[land.length-1][i]){
                answer = visited[land.length-1][i];
            }
        }

        System.out.println("answer = " + answer);

    }
}
