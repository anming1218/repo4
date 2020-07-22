package class0722.onclass.thread1;
/**
 *@program: huipu_onclass
 *@description:
 *@author: ming
 *@create: 2020-07-22 09:31
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1("线程1");
        //启动线程
        thread1.start();
    }
}
