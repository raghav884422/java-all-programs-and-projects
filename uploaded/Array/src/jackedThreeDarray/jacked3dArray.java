package jackedThreeDarray;

import java.util.Scanner;

class jacked3dArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the 1st D length of the school");
		
		String arr[][][] = new String[scan.nextInt()][][];
		
		for (int i= 0;i<=arr.length-1;i++) {
			System.out.println("enter the 2D length for 1stD "+i+"i.e no of class of school " +i);
			arr[i]= new String [scan.nextInt()][];
		}
		
		for (int i =0;i<=arr.length-1;i++) {
			for (int j = 0; j<=arr[i].length;j++) {
				System.out.println("Enter the 3d no. of class "+ i+"number of school  "+i + "number of classes "+j);
				arr[i][j] = new String[scan.nextInt()];
			}
		}
		scan.nextLine();
		for(int i =0;i<=arr.length-1;i++) {
			for (int j=0;j<=arr[i].length-1;j++) {
				for (int k=0;k<=arr[i][j].length-1;k++) {
				System.out.println("enter the name of Student of school "+i+ "class "+j+ "name " +k);
				arr[i][j][k] = scan.nextLine();
				}
			}
		}
		for(int i =0;i<=arr.length-1;i++) {
		System.out.println("{");
			for (int j=0;j<=arr[i].length-1;j++) {
				System.out.println("[");
				for (int k=0;k<=arr[i][j].length-1;k++) {
				System.out.println(arr[i][j][k]);
				if(k!=arr[i][j].length-1)
				System.out.println(", ");
				}
			}  System.out.println("]");
		}System.out.println("{");

		
      }
}