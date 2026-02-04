package practicePeoblem;

import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class firstLetterCapital {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		StringBuilder totalString = new StringBuilder();
		String word[] = s.split(" ");

		for (int i = 0; i <= word.length - 1; i++) {
			StringBuilder sb = new StringBuilder();
			char arrIn[] = word[i].toCharArray();

			sb.append(String.valueOf(arrIn[0]).toUpperCase());

			for (int j = 1; j <= arrIn.length - 1; j++) {
				sb.append(arrIn[j]);
			}
			totalString.append(sb + " ");
		}
		System.out.println(totalString);

	}
}
