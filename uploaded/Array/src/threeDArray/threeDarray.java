package threeDArray;

import java.util.Scanner;

class threeDarray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value of number of school: ");
		int arr [][][] = new int [scan.nextInt()][scan.nextInt()][scan.nextInt()];
		
		for(int i = 0;i<=arr.length-1;i++) {
			for(int j = 0;j<=arr[i].length-1;j++) {
				for(int k = 0;k<=arr[i][j].length-1;k++) {
					System.out.println("enter the marks for "+i+" class"+j);
					arr[i][j][k] = scan.nextInt();
				}
				
			}
			
		}
		for(int i = 0;i<=arr.length-1;i++) {
			for(int j = 0;j<=arr[i].length-1;j++) {
				System.out.print("[");
				for(int k = 0;k<=arr[i][j].length-1;k++) {
					System.out.print(arr[i][j][k]+"   ");
				}System.out.println("]");
				
			}
			
		}
	}
}