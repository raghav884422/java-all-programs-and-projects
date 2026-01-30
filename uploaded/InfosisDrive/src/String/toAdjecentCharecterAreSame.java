package String;

import java.util.Scanner;

public class toAdjecentCharecterAreSame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(reorganizeString(s));
	}

	public static String reorganizeString(String s) {
		// Your code here
		char arr []=s.toCharArray();
		StringBuffer sb = new StringBuffer(s);
	
		for (int i = 0; i <= s.length() - 1; i++) {
		
			for (int j = i; j <= s.length() - 1; j++) {
               
			}
		}

		return "";
	}
}
