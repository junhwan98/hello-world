package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Java04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("숫자 5개를 입력해주세요.");
        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        for(int n : array){
            System.out.print(n + " ");
        }

    }
}
