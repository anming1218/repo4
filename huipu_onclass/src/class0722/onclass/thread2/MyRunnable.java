package class0722.onclass.thread2;
/**
 *@program: huipu_onclass
 *@description:
 *@author: ming
 *@create: 2020-07-22 10:00
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("myRunnable===" + i + Thread.currentThread().getName());
        }
    }
}
