package practice;

import java.util.Scanner;

public class maximumInArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr [] = new int [size];
		for(int i = 0; i<= arr.length-1;i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i = 0; i<= arr.length-1;i++) {
			System.out.print(arr[i]+", ");
		}
	
		int max = arr[0];
		for(int i = 0; i<= arr.length-1;i++) {
			
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("maximum number is "+max);
		
		
	}

}
