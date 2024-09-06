package algorithm;

import java.util.Scanner;
import java.util.Vector;

public class Algorithm240831 {
    public static void main(String[] args) {
int m =4;
int n = 3;
int[][] puddles = {{2,2}};

        int[][] visited = new int[n][m];

        for (int[] i : puddles) {
            visited[i[1]-1][i[0]-1] = -1;
        }

        int answer = 0;
        visited[0][0] = 1;
        for(int i = 0 ; i< n; i++){
            for( int j = 0; j<m; j++){
                if(i ==0 && j == 0) continue;
                if(visited[i][j] == -1) continue;
                if(i !=0 && visited[i-1][j] != -1){
                    visited[i][j] += visited[i-1][j];
                }
                if(j !=0 && visited[i][j-1] != -1){
                    visited[i][j] += visited[i][j-1];
                }

            }
        }

        answer = visited[n-1][m-1];
        System.out.println(answer);
    }
}
