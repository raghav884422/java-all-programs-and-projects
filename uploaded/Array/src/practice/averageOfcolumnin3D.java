package practice;

import java.util.Scanner;

public class averageOfcolumnin3D {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // TODO: Ask user for array dimensions and create the 3D array
	        int arr[][][] = new int [scanner.nextInt()][scanner.nextInt()][scanner.nextInt()];
	     
	        // TODO: Populate the array with user input
	        for(int i=0;i<=arr.length-1;i++){
	            for(int j=0;j<=arr[i].length-1;j++){
	               for(int k=0;k<=arr[i][j].length-1;k++){
	              arr[i][j][k] = scanner.nextInt();
	              }
	           }
	        }
	        System.out.println("3D Array:");
	        for(int i=0;i<=arr.length-1;i++){
	        System.out.println("Layer"+(i+1)+":");
	            for(int j=0;j<=arr[i].length-1;j++){
	               for(int k=0;k<=arr[i][j].length-1;k++){
	              System.out.print(arr[i][j][k]+" ");
	              }
	        System.out.println();
	           }
	        }
	        // TODO: Calculate and print average of each 3D column
	    
	            double average =0;
	            for(int j=0;j<=arr[0].length-1;j++){
	            	for(int k=0;k<=arr[0][j].length-1;k++){
	            int sum =0;
	            for(int i=0;i<=arr.length-1;i++){
	            
	            	   sum=sum+arr[i][j][k];
	            
	               }
	               average= sum/arr.length;
	              System.out.println("Average of column ("+j+","+k+"): "+average);
	           } 
	        }
	    
	        
	        scanner.close();
	    }
	}

