package classPracticeOfString;

import java.util.Scanner;

class reverseOfString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		System.out.println("original string: "+str);
		String revString  = "";
		for(int i = str.length()-1;i>=0;i--) {
			revString = revString + str.charAt(i);
		}
		System.out.println("reverse stroing: " + revString);
		
	}
}