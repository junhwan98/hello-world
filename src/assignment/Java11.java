package assignment;

import java.util.Scanner;

public class Java11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력해주세요 : ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
      sb.reverse();

      s= String.valueOf(sb);
      s = s.toUpperCase();

        System.out.println(s);
    }
}
