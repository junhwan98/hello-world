package javaEx01;

public class Java03 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;
        }

        for(int n : array){
            System.out.print(n + " ");
        }
    }
}
