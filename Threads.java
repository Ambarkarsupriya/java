import java.lang.*;
public class Threads {

	public static void main(String[] args) {
		Counting c = new Counting();
		class Thread1 extends Thread{
			public void run() {
			for(int i =1; i<=1000;i++) {
				c.countering();
			}
		}
	}
		class Thread2 extends Thread{
			public void run() {
			for(int i =1; i<=1000;i++) {
				c.countering();
			}
		}
	}
		Thread t10 = new Thread1();
		 Thread t11 = new Thread2();
		 t10.start();
		 t11.start();
		 try {
			t10.join();
			t11.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		 System.out.println("Count value :"+c.count);
}
}


class Counting{
	int count;
	synchronized void countering() {
		count = count+1;
	}
}