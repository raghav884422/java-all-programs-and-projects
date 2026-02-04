package classPracticeOfString;

import java.util.Scanner;

public class reverseWithSpaceCount {
        public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
        	String s= scan.nextLine();
        	char arr1[] = s.toCharArray();
        	char arr2[] = new char[arr1.length];
        	for(int i =0;i<=arr1.length-1;i++) {
        		if(arr1[i]==' ') {
        			arr2[i]=arr1[i];
        		}
        	}
        	int j = arr1.length-1; 
        	for(int i = 0;i<=arr1.length-1;i++) {
        		if(arr1[i]!=' ') {
        			if(arr2[j]==' ') {
        				j--;	
        			}
        			arr2[j]=arr1[i];
        			j--;
        		}
        	}
        	String str2 = new String(arr2);
        	System.out.println(str2);
		}
}
