package reverse.java;

import java.util.Scanner;
public class reverserofnum {
	
	public class ReverseNumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input number
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int reversed = 0;
	        int original = num;

	        // Reverse logic
	        while (num != 0) {
	            int digit = num % 10;         // get last digit
	            reversed = reversed * 10 + digit; // add digit in reverse order
	            num = num / 10;               // remove last digit
	        }

	        // Output
	        System.out.println("Original number: " + original);
	        System.out.println("Reversed number: " + reversed);

	        sc.close();
	    }
	}


}
