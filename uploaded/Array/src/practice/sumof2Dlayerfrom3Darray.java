package practice;

import java.util.Scanner;

public class sumof2Dlayerfrom3Darray {
	
//	   	public static void main(String[] args) {
//			Scanner scan  = new Scanner(System.in);
//			int arr[][][] = new int [scan.nextInt()][scan.nextInt()][scan.nextInt()];
//			for(int i = 0;i<=arr.length-1;i++) {
//				for(int j= 0;j<=arr[i].length-1;j++) {
//					for(int k = 0;k<=arr[i][j].length-1;k++) {
//						arr[i][j][k]=scan.nextInt();
//					}
//				}
//			}
//			
//			int sum=0;
//			int sum1=0;
//			int sum2 =0;
//				System.out.println("3D Array:");
//			for(int i = 0;i<=arr.length-1;i++) {
//				System.out.println("Layer "+(i+1)+": ");
//				sum1=sum1+sum;
//				sum=0;
//				for(int j= 0;j<=arr[i].length-1;j++) {
//					for(int k = 0;k<=arr[i][j].length-1;k++) {
//						
//						System.out.print(arr[i][j][k]+" ");
//						sum += arr[i][j][k];
//					}System.out.println();
//				
//				}
//			}
//			System.out.println("Sum of layer 1: "+sum1);
//			System.out.println("Sum of layer 2: "+sum);
//			
//			}
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int arr[][][] = new int [scan.nextInt()][scan.nextInt()][scan.nextInt()];
		for(int i = 0;i<=arr.length-1;i++) {
			for(int j= 0;j<=arr[i].length-1;j++) {
				for(int k = 0;k<=arr[i][j].length-1;k++) {
					arr[i][j][k]=scan.nextInt();
				}
			}
		
	}
		System.out.println("3D Array: ");
		for(int i = 0;i<=arr.length-1;i++) {
		System.out.println("Layer "+i+":");
			for(int j= 0;j<=arr[i].length-1;j++) {
				for(int k = 0;k<=arr[i][j].length-1;k++) {
					System.out.print(arr[i][j][k]+" ");
				}System.out.println();
			}
		
	}
		for(int i = 0;i<=arr.length-1;i++) {
			int sum =0;
			for(int j= 0;j<=arr[i].length-1;j++) {
				for(int k = 0;k<=arr[i][j].length-1;k++) {
				sum = sum + arr[i][j][k];
			}
		}
		System.out.println("sum of layer "+i+":"+sum);
	}
	}
	}
