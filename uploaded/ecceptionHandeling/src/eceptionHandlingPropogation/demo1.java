package eceptionHandlingPropogation;

import java.util.Scanner;

public class demo1 {
	public void operationPerform() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 numbers ");
		int a=sc.nextInt();
		int b = sc.nextInt();
		int res = a/b;
		System.out.println(res);
	}

}
