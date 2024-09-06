package practice.javaEx05;

import java.awt.Toolkit;

public class MyRunnable implements Runnable{
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
}
