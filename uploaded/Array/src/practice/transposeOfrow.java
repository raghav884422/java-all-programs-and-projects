package practice;

import java.util.Scanner;

public class transposeOfrow {
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 int m = scanner.nextInt();
	 int n = scanner.nextInt();
     int arr1[][] = new int[m][n];
     for(int i = 0;i<=arr1.length-1;i++) {
    	 for(int j = 0;j<=arr1[i].length-1;j++) {
         arr1[i][j] = scanner.nextInt();
    	 }
     }
  int arr2 [][] = new int [n][m];
  
  for(int i = 0;i<=arr1.length-1;i++) {
 	 for(int j = 0;j<=arr1[i].length-1;j++) {
      arr2[j][i] = arr1[i][j];
 	 }
  }
  System.out.println("ORIGINAL matrix");
  for(int i = 0;i<=arr1.length-1;i++) {
  	 System.out.println("[");
	 for(int j = 0;j<=arr1[i].length-1;j++) {
		 System.out.print(arr1[i][j]+", ");
	 }
	System.out.println("]");
}
  
  System.out.println("final matrix");
    for(int i = 0;i<=arr2.length-1;i++) {
    	 System.out.print("[");
 	 for(int j = 0;j<=arr2[i].length-1;j++) {
 		 System.out.print(arr2[i][j]+", ");
 	 }
 	System.out.println("]");
  }
  
  
}
}
