package practice;

import java.util.Scanner;

public class reverseArray {
     public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);
    	 System.out.println("Enter the length of array");
	        int arr1[] = new int[scanner.nextInt()];
	        
	        for(int i = 0;i<=arr1.length-1;i++) {
	        	 System.out.println("Enter the valof array");
	        	arr1[i] = scanner.nextInt();
	        }
	        
	        int arr2[] =new int[arr1.length];
	        int j = arr2.length-1;
	        
	        for(int i = 0;i<=arr2.length-1 ;i++) {
	            arr2[i] = arr1[j];
	            j--;
	        }
	        System.out.println("orignal array : ");
	        for(int i = 0; i<= arr1.length-1;i++) {
	        	System.out.print(arr1[i]);
	        }
	        
	        System.out.println("reversed array : ");
	        for(int i = 0; i<= arr2.length-1;i++) {
	        	System.out.print(arr2[i]);
	        }
	  
	        
     }
}
