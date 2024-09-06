package assignment;
import java.util.Scanner;
public class Java09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 수를 입력해주세요");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        cul(a,b);
    }
    public  static void cul(int a,int b) {
        System.out.println(a+" + "+b+" = " + sum(a,b));
        System.out.println(a+" - "+b+" = "  + minus(a,b));
        System.out.println(a+" * "+b+" = " + multiply(a,b));
    try{ System.out.println(a+" / "+b+" = "  + division(a,b));
    } catch (Exception e) {
        System.out.println(e.getMessage());
        };
    }
    public  static int sum(int a,int b){
        return a+b;
    }
    public  static int minus(int a,int b){
        return a-b;
    }
    public  static int multiply(int a,int b){
        return a*b;
    }
    public  static double division(int a,int b) throws Exception{
        if (b==0){
            throw new Exception("0으로 나눌수 없습니다.");
        }
        return (double)a/b;
    }
}