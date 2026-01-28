package threeDArray;

import java.util.Arrays;
import java.util.Scanner;

public class threeDimentionalArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of school you want to add: ");
		int arry[][][] = new int[scan.nextInt()][scan.nextInt()][];
		for (int i = 0; i <= arry.length - 1; i++) {
			System.out.println("enter the student of class" + i + "that is 2D length for 1D array" + i);
			arry[i] = new int[scan.nextInt()][];
		}

		for (int j = 0; j <= arry.length - 1; j++) {
			arry[j] = new int[scan.nextInt()][];
		}

		for (int i = 0; i <= arry.length - 1; i++) {
			for (int j = 0; j <= arry[i].length - 1; j++) {
				for (int k = 0; k <= arry[i][j].length - 1; k++) {
					System.out.println("enter the marks for " + i + " class" + j);
					arry[i][j][k] = scan.nextInt();

				}

			}
		}
		for (int i = 0; i <= arry.length - 1; i++) {
			for (int j = 0; j <= arry[i].length - 1; j++) {
				System.out.print("[");
				for (int k = 0; k <= arry[i][j].length - 1; k++) {
					System.out.print(arry[i][j][k] + "   ");
				}
				System.out.println("]");

			}


		}
	}
}
