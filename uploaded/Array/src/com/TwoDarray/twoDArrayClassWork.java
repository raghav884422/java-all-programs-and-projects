package com.TwoDarray;

import java.util.Scanner;

public class twoDArrayClassWork {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the no.of class 1D array and enter the  student in class ");
	String arr[][] = new String[scan.nextInt()][scan.nextInt()];
	
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=0;j<=arr[i].length-1;j++) {
			System.out.println("enter the name of student od class " +i+ " Student "+ j);
			arr[i][j] = scan.next();
		}
	}
	
	for(int i=0;i<=arr.length-1;i++) {
		System.out.print("[");
		for(int j=0;j<=arr[i].length-1;j++) {
		System.out.print(arr[i][j]);
		if (j!=arr[j].length-1) {
			System.out.print(" , ");
		}
		}
		System.out.println("]");
	}
	
}
}
