package calculateUSingMultithreading;

import java.util.Scanner;

public class calculation extends Thread {
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if (name.equals("add")) {
			task1();
		} else if (name.equals("sub")) {
			task2();
		} else {
			task3();
		}
	}

	void task1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 number to add");
		int a = sc.nextInt();
		System.out.println("Enter 2 number to add");
		int b = sc.nextInt();
		int add = a + b;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("addition is " + add);
	}

	void task2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 number to sub");
		int a = sc.nextInt();
		System.out.println("Enter 2 number to sub");
		int b = sc.nextInt();
		int add = a - b;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("substraction is " + add);
	}

	void task3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 number to mul");
		int a = sc.nextInt();
		System.out.println("Enter 2 number to mul");
		int b = sc.nextInt();
		int add = a * b;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("multiplication is " + add);
		
	}
}
