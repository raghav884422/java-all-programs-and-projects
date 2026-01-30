package ArrayPracticeQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class minimumelement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr [] = new int [n];
		for(int i =0;i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();	
			}
	System.out.print("Array: [");
	for(int i =0;i<=arr.length-1;i++) {
		System.out.print(arr[i]+", ");	
			}
	System.out.println("]");
	Arrays.sort(arr);
	int a = arr[0];
	
	System.out.println(a);
	
	
	}
}
