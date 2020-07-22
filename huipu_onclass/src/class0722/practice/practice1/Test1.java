package class0722.practice.practice1;
public class Test1 {

	public static void main(String[] args) {
		Bank bank=new Bank();
		MyThread t1=new MyThread("线程1",bank);
		MyThread t2=new MyThread("线程2",bank);
		t1.start();
		t2.start();

	}

}
