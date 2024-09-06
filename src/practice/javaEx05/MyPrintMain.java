package practice.javaEx05;

import java.util.Timer;

public class MyPrintMain {


    public static void main(String[] args) {

//        Runnable my = new MyRunnable();
        //작업 스레드
//        Thread thread = new Thread(my);

        //익명 구현 객체 사용
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Runnable is running - Count : " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        thread.start();


    }
}
