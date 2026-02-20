package ecceptionHandelingInro;

import java.util.Scanner;

public class manyExceptionInOneProgram {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Connection get Established");
	try {
	System.out.println("enter the two number for division: ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int q = a/b;
	System.out.println("Qutient is : "+q);
	
	
	System.out.println("enter the size of array: ");
	int size =sc.nextInt();
	int arr[]= new int[size];
	System.out.println("enter the value of element of array:");
	int elem =sc.nextInt();
	System.out.println("Enter the index value of array :");
	int index =sc.nextInt();
	
	arr[index] =elem;
	System.out.println("the vale of array element is "+arr[index]);
	}
	catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println("ArithmeticException: in line 13");
	}
	catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
		System.out.println("ArrayIndexOutOfBoundsException: in line 25");
	}
	catch (NegativeArraySizeException e) {
		// TODO: handle exception
		System.out.println("NegativeArraySizeException: in line 19");
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("Exception occured ,try after some time .. your resourcesc are secure ");
	}
	System.out.println("Connection get terminated");
}
}
