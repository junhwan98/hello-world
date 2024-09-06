package assignment;

import java.util.HashMap;
import java.util.Scanner;

public class Java13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> students = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("학생 이름 : ");
            String name = sc.nextLine();
            System.out.print("점수 : ");
            int score = sc.nextInt();
            students.put(name,score);
            sc.nextLine();
        }
        System.out.print("삭제할 학생 이름을 입력하세요 : ");
        String s = sc.nextLine();
        if(students.containsKey(s)){
            students.remove(s);
            System.out.println("삭제되었습니다.");
        }
        else{
            System.out.println("존재하지 않는 학생입니다.");
        }

        for(String name : students.keySet()){
            System.out.println("이름 : " + name + ",\n score : " + students.get(name));
        }
        System.out.print("학생 이름을 입력하세요 : ");
        s= sc.nextLine();
        if(students.containsKey(s)){
            System.out.println("이름 : " + s + ",\n score : " + students.get(s));

        }
        else{
            System.out.println("존재하지 않는 학생입니다.");
        }
    }
}
