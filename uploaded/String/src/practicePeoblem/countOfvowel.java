package practicePeoblem;

import java.util.Scanner;
public class countOfvowel {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // TODO: Ask user for input string
	        System.out.println("Enter a string:");
	        String s = scanner.nextLine();
	        System.out.println("Original String: "+s);
	        s=s.toLowerCase();
	        // TODO: Count vowels in the string
	        int count = 0;
	        for(int i = 0;i<=s.length()-1;i++) {
	            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
	            count++;
	        }
	       System.out.println("Number of vowels: "+count);

	        // TODO: Print the original string and the count of vowels
	        scanner.close();
	    }
	
}
