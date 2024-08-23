package javaEx01;

import java.util.Scanner;

public class Java01 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력해주세요 : ");
        String name = sc.nextLine();
        System.out.print("나이를 입력해주세요 : ");
        String age = sc.nextLine();
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }


}
