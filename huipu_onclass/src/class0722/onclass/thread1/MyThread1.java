package class0722.onclass.thread1;
/**
 *@program: huipu_onclass
 *@description:
 *@author: ming
 *@create: 2020-07-22 09:30
 */
public class MyThread1 extends Thread {


    public MyThread1(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        System.out.println("hello===="+Thread.currentThread().getName());
    }
}
