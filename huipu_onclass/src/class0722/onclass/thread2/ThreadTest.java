package class0722.onclass.thread2;
/**
 *@program: huipu_onclass
 *@description:
 *@author: ming
 *@create: 2020-07-22 10:01
 */
public class ThreadTest {
    public static void main(String[] args) {

        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable, "线程1");
        Thread thread2 = new Thread(runnable, "线程2");

        thread1.start();
        thread2.start();


    }
}
