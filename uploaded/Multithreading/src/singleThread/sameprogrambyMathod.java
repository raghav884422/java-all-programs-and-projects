package singleThread;

import java.util.Scanner;

public class sameprogrambyMathod {
	public static void main(String[] args) {
		System.out.println("main mathod exicution started");
		banking();
		printing();
		addition();

		System.out.println("main mathod exicution started");

	}

	public static void banking() {
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

	public static void printing() {
		System.out.println("Printing activity started");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println("Raghav");
		}
		System.out.println("Printing activity ended");

	}

	public static void addition() {
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
