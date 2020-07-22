package class0722.practice.practice1;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    private double count = 500;

    public double getCount() {
        return count;
    }

    public synchronized void takemoney(double money) throws InterruptedException {
        if (count - money > 0) {
            Thread.sleep(2000);
            count -= money;
            System.out.println(Thread.currentThread().getName() + "取走了" + money + "大洋，还剩：" + (count) + "大洋");
        } else {
            System.out.println(Thread.currentThread().getName() + "对不起，余额不足");
        }
    }

    public void takemoney2(double money) throws InterruptedException {
        synchronized (this) {
            if (count - money > 0) {
                Thread.sleep(2000);
                count -= money;
                System.out.println(Thread.currentThread().getName() + "取走了" + money + "大洋，还剩：" + (count) + "大洋");
            } else {
                System.out.println(Thread.currentThread().getName() + "对不起，余额不足");
            }
        }

    }


    public void takemoney3(double money) throws InterruptedException {
        Lock lock = new ReentrantLock();
        lock.lock();
        try {
            if (count - money > 0) {
                Thread.sleep(2000);
                count -= money;
                System.out.println(Thread.currentThread().getName() + "取走了" + money + "大洋，还剩：" + (count) + "大洋");
            } else {
                System.out.println(Thread.currentThread().getName() + "对不起，余额不足");
            }
        } finally {
            lock.unlock();
        }


    }


}
