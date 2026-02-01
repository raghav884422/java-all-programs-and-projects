package threeProjectbyOneObject;

import java.util.Scanner;

public class Activity implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		if(name.equals("bank")) {
			bank();
		}
		else if(name.equals("print")) {
			print();
		}
		else {
			add();
		}
		
	}

	void bank() {
		System.out.println("bank activity start exicuitng");
		Scanner sc = new Scanner(System.in);
		int pass = 1234;
		int upass = sc.nextInt();
//		use to provied delay to program to exicute
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (pass == upass) {
			System.out.println("Access your account");
		} else {
			System.out.println("password wrong access denied");
		}
		System.out.println("bank activity exicuition ended");

	
	}

	void print() {
		System.out.println("Printing activity started");

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Raghav");
		}
		System.out.println("Printing activity ended");

	}

	void add() {
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
