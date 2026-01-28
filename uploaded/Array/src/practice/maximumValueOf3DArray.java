package practice;

import java.util.Scanner;



public class maximumValueOf3DArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[][][]= new int[scan.nextInt()][scan.nextInt()][scan.nextInt()];
		
		for(int i = 0;i<=arr.length-1;i++) {
          for (int j =0;j<=arr[i].length-1;j++) {
        	  for (int k =0;k<=arr[i][j].length-1;k++) {
        		  arr[i][j][k] = scan.nextInt();
        	  }
          }
		}
		
		for(int i = 0;i<=arr.length-1;i++) {
	          for (int j =0;j<=arr[i].length-1;j++) {
	        	  for (int k =0;k<=arr[i][j].length-1;k++) {
	        		  System.out.print(arr[i][j][k]+" ");
	        	  }
	          }System.out.println();
		}
		System.out.println();
		int max=arr[0][0][0];
		for(int i = 0;i<=arr.length-1;i++) {
	          for (int j =0;j<=arr[i].length-1;j++) {
	        	  for (int k =0;k<=arr[i][j].length-1;k++) {
	        		  if(arr[i][j][k]>max) {
	        			  max = arr[i][j][k];
	        		  }
	        	  }
	          }
	          System.out.println("maximum value is "+max);
			}
		
		
	}

}
