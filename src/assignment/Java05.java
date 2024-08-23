package assignment;

import java.util.Scanner;

public class Java05 {
    public static void main(String[] args) {
        //사용자가 입력한 두 정수에 대한 더와기와 빼기 연산
        Scanner sc = new Scanner(System.in);

        System.out.println("두 수를 입력하세요");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("두 수의 덧셈 : " + a + " + " + b + " = " + (a + b));
        System.out.println("두 수의 뺄셈 : " + a + " - " + b + " = " + (a - b));

    }
}
