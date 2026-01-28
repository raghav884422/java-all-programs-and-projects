package practice;

import java.util.Scanner;

public class averageOarray {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int arr[] = new int [scanner.nextInt()];
	        for(int i = 0;i<=arr.length-1;i++) {
	            arr[i]=scanner.nextInt();
	        }
	        int sum =0;
	        System.out.print("Array: [");
	        for(int i = 0;i<=arr.length-1;i++) {
	             sum += arr[i];
	             System.out.print(arr[i]);
	            if(i< arr.length){
	                System.out.print(", ");
	            }
	        }

	        System.out.println("]");
	        int average = sum/arr.length;
	        System.out.println("Average: " + average);

	        // TODO: Ask user for array size and create the array
	        
	        // TODO: Populate the array with user input
	        
	        // TODO: Calculate the average of array elements
	        
	        // TODO: Print the original array and the average
	        
	        scanner.close();
	    }
	}

