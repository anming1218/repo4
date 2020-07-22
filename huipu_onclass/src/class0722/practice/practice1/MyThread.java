package class0722.practice.practice1;
public class MyThread extends Thread{
	private Bank bank;

	public MyThread(String name,Bank bank) {
		this.setName(name);
		this.bank=bank;
	}
	@Override
	public void run() {
         try {
			bank.takemoney3(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 

}
