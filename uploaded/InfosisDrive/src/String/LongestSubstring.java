package String;

import java.util.Scanner;

public class LongestSubstring {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
int maxCount = 0;
		for (int i = 0; i <= s.length()- 1; i++) {
			String currentsubstring = "";
			for (int j = i + 1; j <= s.length()-1; j++) {
				char currentChar = s.charAt(j);
				if(currentsubstring.indexOf(currentChar)==-1) {
					currentsubstring += currentChar; 
				} else {
					break;
				}
                        
			}
			if(currentsubstring.length()>maxCount) {
				maxCount = currentsubstring.length();
			}
		}
		System.out.println(maxCount);
	}

}
