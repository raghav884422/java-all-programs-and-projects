package practice;

import java.util.Scanner;

public class sumOfMinimumElementOfArray {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int arr [][] = new int [scanner.nextInt()][scanner.nextInt()];
	        int finalSum =0;
	        for (int i = 0;i<=arr.length-1;i++){
	            for(int j = 0;j<=arr[i].length-1;j++) {
	                arr[i][j] = scanner.nextInt();
	            }
	        }
	        for (int i = 0;i<=arr.length-1;i++){
	        	System.out.print("[");
	            for(int j = 0;j<=arr[i].length-1;j++) {
	                System.out.print(arr[i][j]+", ");
	                
	            }
	            System.out.println("]");
	        }


	        for (int i = 0;i<=arr.length-1;i++){
	         int rowmin = arr[i][0];
	            for(int j = 1;j<=arr[i].length-1;j++) {
	                if(arr[i][j]<rowmin){
	                    rowmin = arr[i][j];
	                }
	            }
	            System.out.println("Minimum of row"+(i+1)+": " + rowmin);
	            finalSum +=rowmin;

	        }
	                System.out.println("Sum of minimum elements: "+finalSum);
	        
	        // TODO: Ask user for array dimensions and create the 2D array
	        
	        // TODO: Populate the array with user input
	        
	        // TODO: Find min element in each row and calculate their sum
	        
	        scanner.close();
	    }
	}


