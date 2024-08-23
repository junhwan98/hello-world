package algorithm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int min = array[0];
        int max = array[0];

        for(int j : array){
            if(j < min) min = j;
            if(j > max) max = j;
        }

        System.out.println(min + " " + max);

        sc.close();
    }
}
