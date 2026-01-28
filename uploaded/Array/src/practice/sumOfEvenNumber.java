package practice;

import java.util.Scanner;

public class sumOfEvenNumber {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int arr[] = new int[scanner.nextInt()];
		        for(int i =0;i<=arr.length-1;i++) {
		            arr[i]= scanner.nextInt();
		        }
		        int sum=0;
		        System.out.print("Array: [");
		        for(int i =0;i<=arr.length-1;i++) {
		         System.out.print(arr[i]);
		         if(i<arr.length-1) {
		            System.out.print(", ");
		         }
		         if (arr[i]%2==0) {
		              sum += arr[i];
		         }
		        }
		        System.out.println("]");
		        System.out.println("Sum of even numbers: "+sum);

		        // TODO: Ask user for array size and create the array
		        
		        // TODO: Populate the array with user input
		        
		        // TODO: Calculate sum of even numbers
		        
		        // TODO: Print the original array and sum of even numbers
		        
		        scanner.close();
		    }
		
	
}
