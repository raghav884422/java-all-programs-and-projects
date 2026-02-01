package Multithreading;

public class addition extends Thread {
	@Override
public void run() {
		System.out.println("Addition mathod started");
		int a = 10;
		int b = 20;
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Result is : " + a + b);
		System.out.println("Addition mathod ended");
}
}
