package practice;

import java.util.Iterator;
import java.util.Scanner;

public class minimumElemntOfarray {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
		int arr[] = new int [scan.nextInt()];
		for (int i = 0; i<=arr.length-1;i++) {
			arr[i]= scan.nextInt();
		}
		int min=arr[0];
		System.out.print("[");
		for (int i = 0; i<=arr.length-1;i++) {
			System.out.print(arr[i]);
			if(i<arr.length) {
				System.out.print(", ");
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("]");
		System.out.println("minimum in the array is "+min);
	}

}
