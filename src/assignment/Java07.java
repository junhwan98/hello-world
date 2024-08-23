package assignment;

import java.util.Scanner;

public class Java07 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + "번째 요소 : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("배열의 요소 : [");
        for(int j : arr){
            System.out.print(j + " ");
        }
        System.out.println("]");

        System.out.println("요소 변경 전 평균값 : " + average(arr));

        System.out.print("첫 번째 요소 변경 : ");
        arr[0] = sc.nextInt();

        System.out.print("배열의 요소 : [");
        for(int j : arr){
            System.out.print(j + " ");
        }
        System.out.println("]");

        System.out.println("요소 변경 후 평균값 : " + average(arr));
    } //main()

    public static double average(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return (double)sum/arr.length;
    }

}
