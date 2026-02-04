package practicePeoblem;

import java.util.Scanner;



public class extrantDigitFromString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s= scan.nextLine();
		StringBuffer sb = new StringBuffer(s.length());
		String regex = "^[+-]?\\d+$";

		for(int i = 0;i<=s.length()-1;i++) {
			if(s.charAt(i) =='0'||s.charAt(i) =='1'||s.charAt(i) =='2'||s.charAt(i) =='3'||s.charAt(i) =='4'||s.charAt(i) =='5'||s.charAt(i) =='6'||s.charAt(i) =='7'||s.charAt(i) =='8'||s.charAt(i) =='9') {
	
			sb.append(s.charAt(i));
			}
		}
		System.out.println(sb);
		
	}

}
