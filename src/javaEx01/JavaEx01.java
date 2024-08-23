package javaEx01;

import java.util.Scanner;

public class JavaEx01 {



    public static void main(String[] args) {
        // 콘솔 출력
        System.out.println("Hello Java!");
        System.out.print("Enter your name :");


        // 콘솔 입력
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();  //nextInt() , nextDouble()

       System.out.println("Welcome, " + name + "!");

        // 변수 : 데이터 저장하는 메모리 공간. 선언과 초기화
        // 데이터 타입
        // 정수형
        int age = 27;
        long population = 9009020222L;

        // 실수형
        float weight = 70.5f;
        double height = 169.4;

        // 문자형
        char ch = '3';

        // 논리형
        boolean isStudent = true; // true / false

        //출력
        System.out.println("Age : " + age);


        //명시적 형 변환 (타입 캐스팅) : 큰 타입에서 작은 타입으로 수동변환
        double pi = 3.14;
        int truncatedPi = (int)pi;
        System.out.println("pi =" + pi + "\ntruncatedPi = " + truncatedPi);

        // 연산자
        // 산술 연산자 : +, -, *, /, %
        // 비굑 연산자 : ==, !=, <, >, <=, >=
        // 논리 연산자 : &&, ||, !

        // 두 수를 입력받아 홀수인지 짝수인지 판별 하는 프로그램

        System.out.println("숫자를 입력해주세요");
        int a = scanner.nextInt();

        if(a%2==0){
            System.out.println("입력한 숫자는 짝수 입니다.");
        }
        else System.out.println("입력한 숫자는 홀수 입니다.");
if (a < 10) System.out.println(a + "는 한자리 숫자입니다.");
    else if(a<100) System.out.println(a +"는 두자리 숫자입니다");
    else if(a<1000) System.out.println(a +"는 세자리 숫자입니다");

    // switch
        switch (a){  //변수는 프리미티브 타입이어야 함
            case 1:
                System.out.println("일");
                break;
            case 2:
                System.out.println("이");
                    break;
            default:
                System.out.println("아무것도 아님");
                break;

        }//end of switch

        //반복문
        // for : 고정된 횟수만큼.
        // while문 : 조건식이 참인동안 반복
        // do-while문 : 코드 블록을 먼저 실행하고 , 조건식이 참이면 반복실행
        /*
        반복문
        배열과 반복문
        java.util.Arrays 클래스
         */
        for (int i = 0; i < 10; i++) {
        }
    }// end of main()
}
