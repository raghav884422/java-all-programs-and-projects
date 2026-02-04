package classPracticeOfString;

import java.util.Scanner;

public class reverseOworld {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		System.out.println(s);
		String words[]=s.split(" ");
		String revSentance = "";
		
		for(int i =0;i<=words.length-1;i++) {
			String word = words[i];
			String revword= "";
			for(int j=word.length()-1;j>=0;j--) {
				revword = revword+word.charAt(j);
			}
			revSentance = revSentance + revword+" ";
		}
		revSentance = revSentance.trim();
		System.out.println(revSentance);
	}

}
