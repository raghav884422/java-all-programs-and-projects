package jaggedArray;

import java.util.Scanner;
public class jaggedClassQuestion {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the no. of classes");
			String arr[][] = new String[scan.nextInt()][];
//			arr[0] = new int[4];
//			arr[0] = new int[2];
//			arr[0] = new int[5];
//			arr[0] = new int[3];
			for(int i =0;i<=arr.length-1;i++) {
				System.out.println("enter the student of class" + i +"that is 2D length for 1D array"+i);
				arr[i] = new String[scan.nextInt()];
			}
			scan.nextLine();
			for(int i=0;i<=arr.length-1;i++) {
				for(int j=0;j<=arr[i].length-1;j++) {
					System.out.println("enter the name of student of class"+i+"student"+j);
					arr[i][j] = scan.nextLine();
				}
			}
			System.out.println("the names in array are: ");
			for(int i=0;i<=arr.length-1;i++) {
				System.out.print("[");
				for(int j=0;j<=arr[i].length-1;j++) {
					System.out.print(arr[i][j]);
					if(j!=arr[i].length-1)
						System.out.print(", ");
				}
				System.out.println("]");
			}
		}
	}

