package javaEx01;

import java.util.Scanner;

public class javaEx02 {

    //반복문
    // for : 고정된 횟수만큼.
    // 향상된 for문 (for ~ each) : 배열이나 컬렉션의 모든 요소를 순차적으로 반복
    // while문 : 조건식이 참인동안 반복
    // do-while문 : 코드 블록을 먼저 실행하고 , 조건식이 참이면 반복실행

    //for문
    // 사용자가 입력한 숫자에 대해 1부터 10까지 곱셈표 출력

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("곱셈표를 출력할 숫자를 입력 : ");
        int number = sc.nextInt();

        for (int i = 1; i <=10 ; i++) {
            System.out.println(number + " x " + i +" = "+ number*i);
        }

        System.out.println("숫자를 입력해주세요.");

        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println(n + "개의 정수를 입력 하세요: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("배열의 요소 : ");
        for (int j : array){
            System.out.print(j+" ");
        }
        System.out.println();
        System.out.println();


        // while 문 : 조건식이 만족하는 동안 반복
        // 사용자가 입력한 숫자까지의 합을 계산해서 출력 (10 : 1~10 까지의 합)
        System.out.print("합을 계산할 숫자를 입력: ");
        int limit = sc.nextInt();
        int sum = 0; // 합을 저장할 변수
        int count = 1; //반복을 제어할 변수
        while (count<=limit){

            // count가 limit보다 작거나 같을 동안 sum에 count를 더하기
            sum += count;  // sum = sum+count
            count++; // count 증가 : count = count + 1


        }
        System.out.println("1부터 " + limit + "까지의 합은 " + sum);


        // do-while 문 : while문 안에 구문을 한번은 실행해야 할 때, 조건식을 나중에 비교.
        // 사용자가 맞출 때까지 숫자를 추측하는 게임
        int secret = 7; //비밀숫자
        int guess;

        do {
            System.out.print("숫자를 맞춰보세요 (1~10) : ");
            guess = sc.nextInt();
        }while(guess != secret);
        System.out.println("축하합니다 정답입니다 !");


    }//main()

    //for-each문
    // 사용자가 입력한 정수 배열의 모든 요소를 출력




}
