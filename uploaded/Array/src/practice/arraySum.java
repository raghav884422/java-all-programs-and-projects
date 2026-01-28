package practice;

import java.util.Scanner;

class arraySum{	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int arr[] = new int[scanner.nextInt()];
	        int sum =0;
	        for(int i = 0;i<=arr.length-1;i++) {
	            arr[i] = scanner.nextInt();
	        }
	        System.out.print("[");
	        for(int i = 0;i<=arr.length-1;i++) {
	        	sum+=arr[i];
	            System.out.print(arr[i]);
	            if(i!= arr.length-1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
	        System.out.println("Sum: "+sum);
	        
	        // TODO: Create a 1D array of integers with size 5
	        
	        // TODO: Populate the array with user input
	        
	        // TODO: Calculate the sum of all elements in the array
	        
	        // TODO: Print the original array and the calculated sum
	        
	        scanner.close();
	    }
	
}