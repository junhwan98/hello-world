package assignment;

import java.util.Scanner;

public class Java02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요.");
        int num = sc.nextInt();
        if(num % 2 ==0){
            System.out.println("입력한 숫자는 짝수입니다.");
        }
        else System.out.println("입력한 숫자는 홀수입니다.");
    }
}
