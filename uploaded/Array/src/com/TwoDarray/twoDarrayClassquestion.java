package com.TwoDarray;

import java.util.Scanner;

class twoDarrayClassquestion {
//	2D array question  class storing marks of 3 class and 4 student in each class
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the number of class and no. of student in each class");
		
		double arr[][]= new double[scan.nextInt()][scan.nextInt()];
		
		for (int i =0;i<=arr.length-1;i++) {
		
			for (int j= 0;j<=arr[i].length-1;j++) {
				System.out.println("enter the marks of student of class "+i+ "marks: ");
				arr[i][j] = scan.nextDouble();
			}
		}
		
		for (int i =0;i<=arr.length-1;i++) {
			System.out.println("marks present in each class are: ");
			System.out.print("[");
			for (int j= 0;j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j]);
				if (j!=arr[j].length-1) {
					System.out.print(",");
				}
			}
			System.out.println("]");
		}
		
	}
}