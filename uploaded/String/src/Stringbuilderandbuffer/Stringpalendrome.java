package Stringbuilderandbuffer;

import java.util.Scanner;

public class Stringpalendrome {
	public static void main(String[] args) {
       
//		Scanner scan = new Scanner(System.in);
//       System.out.println("Enter the String ");
//       
//       String str1 = scan.nextLine();
//       System.out.println(str1);
//       
//       StringBuilder sb =new StringBuilder(str1);
//       sb.reverse();
//       
//       String s1 = new String(sb);
//       System.out.println(s1);
//      
//       if(str1.equals(s1)) {
//    	   System.out.println("String is palindrome");
//       }
//       else {
//    	   System.out.println("String is not  palindrome");
//
//    	   
//       }
//		another approch
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the string ");
		
		String str = scan.next();
		
		char arr1[] = str.toCharArray();
		char arr2 [] = new char[arr1.length];
		
		int j = arr2.length-1;
		
		for (int i=0;i<=arr1.length-1;i++) {
			arr2[j] = arr1[i];
			j--;
		}
		
		String str2 = new String(arr2);
		
		if(str.equals(str2)) {
			System.out.println("this is palendrome");
		}
		else { 
			System.out.println("not an palendrome");
		}
		
		
		
       
	}
	
}
