package ecceptionHandelingInro;

import java.util.Scanner;

public class divisonProgram {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Connection get Established");
	try {
	System.out.println("enter the two number for division: ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int q = a/b;
	System.out.println("Qutient is : "+q);
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("Exception occured ,by the way go to School learn more"+e);
	}
	System.out.println("Connection get terminated");
}
}
