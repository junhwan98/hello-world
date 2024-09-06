package assignment;

import java.util.Scanner;

public class Java12 {

    @FunctionalInterface
    interface Calculator{
double cal(double a, double b);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("두 수를 입력하세요 : ");
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();

        System.out.println("연산자를 입력하세요");
        String operator = sc.next();

        Calculator calculator;

        switch(operator){
            case "+":
                calculator = ( a , b ) -> a+b;
                break;
            case "-":
                calculator = ( a , b ) -> a-b;
                break;
            case "*":
                calculator = ( a , b ) -> a*b;
                break;
            case "/":
                if(num2==0){
                    System.out.println("0으로 나눌 수 없습니다.");
                    return;
                }
                calculator = ( a , b ) -> a/b;
                break;

            default :
                System.out.println("잘못된 연산입니다.");
                return;
        }

        double ret = calculator.cal(num1 , num2);
        System.out.println(num1 + operator+num2 + " = " + ret);
    }
}
