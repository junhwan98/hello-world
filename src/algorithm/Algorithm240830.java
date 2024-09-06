package algorithm;

import java.util.Arrays;

public class Algorithm240830 {
    public static int[] main(String[] args) {
        int n = 2;
        int s = 9;

        if(s == 1 && n != 1 || n > s ) return new int[]{-1};

        int[] answer = new int[n];
        int a = s / n;  //나눈값
        int b = s % n;  //나머지


        for (int i = 0; i < n; i++, --b) {
            answer[i] = a;
            if (b > 0) answer[i]++;
        }
        Arrays.sort(answer);
        return answer;
        }

}
